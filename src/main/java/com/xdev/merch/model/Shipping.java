package com.xdev.merch.model;
public class Shipping {

	private int id;
	private int userId;
	private String title;
	private String subtitle;
	private double price;
	public Shipping(int id, int userId, String title, String subtitle, double price) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.subtitle = subtitle;
		this.price = price;
	}

	public Shipping() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}