package com.xdev.merch.model;
public class MollyText {

	private int id;
	private String text;
	public MollyText(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public MollyText() {
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