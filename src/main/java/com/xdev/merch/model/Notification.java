package com.xdev.merch.model;
import java.security.Timestamp;


public class Notification {

	private int id;
	private int orderId;
	private int userId;
	private int vendorId;
	private int productId;
	private int conversationId;
	private boolean isRead;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public Notification(int id, int orderId, int userId, int vendorId, int productId, int conversationId, boolean isRead, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.orderId = orderId;
		this.userId = userId;
		this.vendorId = vendorId;
		this.productId = productId;
		this.conversationId = conversationId;
		this.isRead = isRead;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Notification() {
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getConversationId() {
		return conversationId;
	}

	public void setConversationId(int conversationId) {
		this.conversationId = conversationId;
	}

	public boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
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