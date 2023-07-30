package com.xdev.merch.model.entity;

public class FavoriteSeller {

	private int id;
	private int userId;
	private int vendorId;
	public FavoriteSeller(int id, int userId, int vendorId) {
		this.id = id;
		this.userId = userId;
		this.vendorId = vendorId;
	}

	public FavoriteSeller() {
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

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

}