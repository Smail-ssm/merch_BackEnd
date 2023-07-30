package com.xdev.merch.model.entity;

public class UserNotification {

	private int id;
	private int userId;
	private String orderNumber;
	private boolean isRead;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public UserNotification(int id, int userId, String orderNumber, boolean isRead, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.userId = userId;
		this.orderNumber = orderNumber;
		this.isRead = isRead;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public UserNotification() {
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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}