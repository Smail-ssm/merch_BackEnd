package com.xdev.merch.model;
public class VendorColor {

	private int id;
	private String color;
	public VendorColor(int id, String color) {
		this.id = id;
		this.color = color;
	}

	public VendorColor() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}