package com.xdev.merch.model.entity;

public class Wishlist {

	private int id;
	private int userId;
	private int productId;
	public Wishlist(int id, int userId, int productId) {
		this.id = id;
		this.userId = userId;
		this.productId = productId;
	}

	public Wishlist() {
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}