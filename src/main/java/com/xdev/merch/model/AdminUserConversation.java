package com.xdev.merch.model;

import java.security.Timestamp;

public class AdminUserConversation {

	private int id;
	private String subject;
	private int userId;
	private String message;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String type;
	private String orderNumber;
	public AdminUserConversation(int id, String subject, int userId, String message, Timestamp createdAt, Timestamp updatedAt, String type, String orderNumber) {
		this.id = id;
		this.subject = subject;
		this.userId = userId;
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.type = type;
		this.orderNumber = orderNumber;
	}

	public AdminUserConversation() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

}