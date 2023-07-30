package com.xdev.merch.model;
public class FooterLogo {

	private int id;
	private String logo;
	public FooterLogo(int id, String logo) {
		this.id = id;
		this.logo = logo;
	}

	public FooterLogo() {
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