package com.xdev.merch.model;

import java.time.LocalDate;

public class ProductClick {

	private int id;
	private int productId;
	private LocalDate date;
	public ProductClick(int id, int productId, LocalDate date) {
		this.id = id;
		this.productId = productId;
		this.date = date;
	}

	public ProductClick() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}