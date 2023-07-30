package com.xdev.merch.model.entity;

public class Conversation {

	private int id;
	private String subject;
	private int sentUser;
	private int receivedUser;
	private String message;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public Conversation(int id, String subject, int sentUser, int receivedUser, String message, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.subject = subject;
		this.sentUser = sentUser;
		this.receivedUser = receivedUser;
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Conversation() {
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

}