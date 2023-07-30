package com.xdev.merch.model.entity;

public class Paytm {

	private int id;
	private int isPaytm;
	public Paytm(int id, int isPaytm) {
		this.id = id;
		this.isPaytm = isPaytm;
	}

	public Paytm() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsPaytm() {
		return isPaytm;
	}

	public void setIsPaytm(int isPaytm) {
		this.isPaytm = isPaytm;
	}

}