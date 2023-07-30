package com.xdev.merch.model;
public class MaintainText {

	private int id;
	private String text;
	public MaintainText(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public MaintainText() {
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