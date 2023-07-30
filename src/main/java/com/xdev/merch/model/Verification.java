package com.xdev.merch.model.entity;

public class Verification {

	private int id;
	private int userId;
	private String attachments;
	private String status;
	private String text;
	private boolean adminWarning;
	private String warningReason;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public Verification(int id, int userId, String attachments, String status, String text, boolean adminWarning, String warningReason, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.userId = userId;
		this.attachments = attachments;
		this.status = status;
		this.text = text;
		this.adminWarning = adminWarning;
		this.warningReason = warningReason;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Verification() {
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

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean getAdminWarning() {
		return adminWarning;
	}

	public void setAdminWarning(boolean adminWarning) {
		this.adminWarning = adminWarning;
	}

	public String getWarningReason() {
		return warningReason;
	}

	public void setWarningReason(String warningReason) {
		this.warningReason = warningReason;
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