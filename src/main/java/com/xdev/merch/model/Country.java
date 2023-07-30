package com.xdev.merch.model.entity;

public class Country {

	private int id;
	private String countryCode;
	private String countryName;
	public Country(int id, String countryCode, String countryName) {
		this.id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public Country() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}