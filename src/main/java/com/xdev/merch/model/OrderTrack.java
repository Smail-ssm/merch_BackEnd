package com.xdev.merch.model;
import java.security.Timestamp;


public class OrderTrack {

	private int id;
	private int orderId;
	private String title;
	private String text;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public OrderTrack(int id, int orderId, String title, String text, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.orderId = orderId;
		this.title = title;
		this.text = text;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public OrderTrack() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}