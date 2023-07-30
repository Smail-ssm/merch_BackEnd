package com.xdev.merch.model.entity;

public class RazorpayKey {

	private int id;
	private String key;
	public RazorpayKey(int id, String key) {
		this.id = id;
		this.key = key;
	}

	public RazorpayKey() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}