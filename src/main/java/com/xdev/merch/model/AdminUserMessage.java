package com.xdev.merch.model;
import java.security.Timestamp;

public class AdminUserMessage {

	private int id;
	private int conversationId;
	private String message;
	private int userId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public AdminUserMessage(int id, int conversationId, String message, int userId, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.conversationId = conversationId;
		this.message = message;
		this.userId = userId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public AdminUserMessage() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConversationId() {
		return conversationId;
	}

	public void setConversationId(int conversationId) {
		this.conversationId = conversationId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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