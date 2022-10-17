package com.gl.caseStudy4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4.bean.Bill;
import com.gl.caseStudy4.bean.Offer;
import com.gl.caseStudy4.service.RechargeService;

@RestController
public class RechargeController {
	
	@Autowired
	private RechargeService service;
	
	@GetMapping(value="/welcomePage")
	 public ModelAndView showWelcomePage() {
		ModelAndView mv = new ModelAndView("welcomePage");
		List<Offer> offerList = service.findAllOffers();
		mv.addObject("offerList",offerList);
		return mv;
	}
	
	@GetMapping("/performRecharge")
	public ModelAndView saveNewBill(@RequestParam("mobileNumber") String mobileNumber,
									  @RequestParam("offerId") long offerId) {
		long id = service.generateId();
		Bill bill = new Bill();
		bill.setMobileNumber(mobileNumber);
		bill.setOfferId(offerId);
		bill.setTransactionId(id);
		service.billSave(bill);
		Offer offer = service.findAOffer(offerId);
		ModelAndView mv = new ModelAndView("billView");
		mv.addObject("offer",offer);
		mv.addObject("bill",bill);
		return mv;
	}
}
