package com.xdev.merch.model;
public class PaytmSecret {

	private int id;
	private String secret;
	public PaytmSecret(int id, String secret) {
		this.id = id;
		this.secret = secret;
	}

	public PaytmSecret() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}