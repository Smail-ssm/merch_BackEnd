package com.xdev.merch.model.entity;

public class Gallery {

	private int id;
	private int productId;
	private String photo;
	public Gallery(int id, int productId, String photo) {
		this.id = id;
		this.productId = productId;
		this.photo = photo;
	}

	public Gallery() {
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}