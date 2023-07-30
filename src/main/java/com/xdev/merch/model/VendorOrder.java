package com.xdev.merch.model.entity;

public class VendorOrder {

	private int id;
	private int userId;
	private int orderId;
	private int qty;
	private double price;
	private String orderNumber;
	private String status;
	public VendorOrder(int id, int userId, int orderId, int qty, double price, String orderNumber, String status) {
		this.id = id;
		this.userId = userId;
		this.orderId = orderId;
		this.qty = qty;
		this.price = price;
		this.orderNumber = orderNumber;
		this.status = status;
	}

	public VendorOrder() {
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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}