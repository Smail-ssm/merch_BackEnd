package com.xdev.merch.model.entity;

public class PaytmIndustry {

	private int id;
	private String industry;
	public PaytmIndustry(int id, String industry) {
		this.id = id;
		this.industry = industry;
	}

	public PaytmIndustry() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}