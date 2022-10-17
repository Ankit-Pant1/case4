package com.gl.caseStudy4.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offer {
	
	@Id
	private Long id; 
	private Integer days;
    private Integer talkTime;
    private Double data;
    private Integer price;
    
	public Offer() {
		super();
		
	}

	public Offer(Long id, Integer days, Integer talkTime, Double data, Integer price) {
		super();
		this.id = id;
		this.days = days;
		this.talkTime = talkTime;
		this.data = data;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(Integer talkTime) {
		this.talkTime = talkTime;
	}

	public Double getData() {
		return data;
	}

	public void setData(Double data) {
		this.data = data;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
    
}
