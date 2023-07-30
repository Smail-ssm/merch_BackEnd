package com.xdev.merch.model;
public class Subscription {

	private int id;
	private String title;
	private String currency;
	private String currencyCode;
	private double price;
	private int days;
	private int allowedProducts;
	private String details;
	public Subscription(int id, String title, String currency, String currencyCode, double price, int days, int allowedProducts, String details) {
		this.id = id;
		this.title = title;
		this.currency = currency;
		this.currencyCode = currencyCode;
		this.price = price;
		this.days = days;
		this.allowedProducts = allowedProducts;
		this.details = details;
	}

	public Subscription() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getAllowedProducts() {
		return allowedProducts;
	}

	public void setAllowedProducts(int allowedProducts) {
		this.allowedProducts = allowedProducts;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}