package com.xdev.merch.model.entity;

public class InvoiceLogo {

	private int id;
	private String logo;
	public InvoiceLogo(int id, String logo) {
		this.id = id;
		this.logo = logo;
	}

	public InvoiceLogo() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}