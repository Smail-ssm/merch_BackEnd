package com.xdev.merch.model;
public class Secure {

	private int id;
	private boolean isSecure;
	public Secure(int id, boolean isSecure) {
		this.id = id;
		this.isSecure = isSecure;
	}

	public Secure() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsSecure() {
		return isSecure;
	}

	public void setIsSecure(boolean isSecure) {
		this.isSecure = isSecure;
	}

}