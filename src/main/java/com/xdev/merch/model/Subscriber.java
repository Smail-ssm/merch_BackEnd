package com.xdev.merch.model;
public class Subscriber {

	private int id;
	private String email;
	public Subscriber(int id, String email) {
		this.id = id;
		this.email = email;
	}

	public Subscriber() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}