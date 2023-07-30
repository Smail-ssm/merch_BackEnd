package com.xdev.merch.model;
public class RazorpaySecret {

	private int id;
	private String secret;
	public RazorpaySecret(int id, String secret) {
		this.id = id;
		this.secret = secret;
	}

	public RazorpaySecret() {
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