package com.xdev.merch.model;
public class PaypalCheck {

	private int id;
	private boolean paypalCheck;
	private String paypalBusiness;
	public PaypalCheck(int id, boolean paypalCheck, String paypalBusiness) {
		this.id = id;
		this.paypalCheck = paypalCheck;
		this.paypalBusiness = paypalBusiness;
	}

	public PaypalCheck() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getPaypalCheck() {
		return paypalCheck;
	}

	public void setPaypalCheck(boolean paypalCheck) {
		this.paypalCheck = paypalCheck;
	}

	public String getPaypalBusiness() {
		return paypalBusiness;
	}

	public void setPaypalBusiness(String paypalBusiness) {
		this.paypalBusiness = paypalBusiness;
	}

}