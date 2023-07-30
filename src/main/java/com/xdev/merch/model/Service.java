package com.xdev.merch.model.entity;

public class Service {

	private int id;
	private int userId;
	private String title;
	private String details;
	private String photo;
	public Service(int id, int userId, String title, String details, String photo) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.details = details;
		this.photo = photo;
	}

	public Service() {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}