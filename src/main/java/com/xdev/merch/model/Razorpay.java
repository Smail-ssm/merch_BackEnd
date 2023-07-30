package com.xdev.merch.model;
public class Razorpay {

	private int id;
	private int isRazorpay;
	public Razorpay(int id, int isRazorpay) {
		this.id = id;
		this.isRazorpay = isRazorpay;
	}

	public Razorpay() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsRazorpay() {
		return isRazorpay;
	}

	public void setIsRazorpay(int isRazorpay) {
		this.isRazorpay = isRazorpay;
	}

}