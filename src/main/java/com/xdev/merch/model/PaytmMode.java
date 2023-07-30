package com.xdev.merch.model.entity;

public class PaytmMode {

	private int id;
	private String mode;
	public PaytmMode(int id, String mode) {
		this.id = id;
		this.mode = mode;
	}

	public PaytmMode() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}