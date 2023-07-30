package com.xdev.merch.model;
public class PaytmWebsite {

	private int id;
	private String website;
	public PaytmWebsite(int id, String website) {
		this.id = id;
		this.website = website;
	}

	public PaytmWebsite() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}