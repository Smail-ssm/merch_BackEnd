package com.xdev.merch.model.entity;

public class PaytmText {

	private int id;
	private String text;
	public PaytmText(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public PaytmText() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}