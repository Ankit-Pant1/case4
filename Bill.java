package com.gl.caseStudy4.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	
	@Id
	private Long transactionId;
	private String mobileNumber;
	private Long offerId;
	
	public Bill() {
		super();
	}

	public Bill(Long transactionId, String mobileNumber, Long offerId) {
		super();
		this.transactionId = transactionId;
		this.mobileNumber = mobileNumber;
		this.offerId = offerId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

}
