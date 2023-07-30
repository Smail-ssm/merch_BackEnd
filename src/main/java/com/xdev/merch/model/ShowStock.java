package com.xdev.merch.model.entity;

public class ShowStock {

	private int id;
	private boolean showStock;
	public ShowStock(int id, boolean showStock) {
		this.id = id;
		this.showStock = showStock;
	}

	public ShowStock() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getShowStock() {
		return showStock;
	}

	public void setShowStock(boolean showStock) {
		this.showStock = showStock;
	}

}