package com.xdev.merch.model;
public class PaytmMerchant {

	private int id;
	private String merchant;
	public PaytmMerchant(int id, String merchant) {
		this.id = id;
		this.merchant = merchant;
	}

	public PaytmMerchant() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

}