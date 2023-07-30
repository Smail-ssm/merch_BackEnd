package com.xdev.merch.model;

import java.security.Timestamp;

public class Message {

	private int id;
	private int conversationId;
	private String message;
	private int sentUser;
	private int receivedUser;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public Message(int id, int conversationId, String message, int sentUser, int receivedUser, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.conversationId = conversationId;
		this.message = message;
		this.sentUser = sentUser;
		this.receivedUser = receivedUser;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Message() {
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

	public int getSentUser() {
		return sentUser;
	}

	public void setSentUser(int sentUser) {
		this.sentUser = sentUser;
	}

	public int getReceivedUser() {
		return receivedUser;
	}

	public void setReceivedUser(int receivedUser) {
		this.receivedUser = receivedUser;
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