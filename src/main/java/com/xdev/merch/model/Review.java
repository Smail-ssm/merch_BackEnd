package com.xdev.merch.model;
public class Review {

	private int id;
	private String photo;
	private String title;
	private String subtitle;
	private String details;
	public Review(int id, String photo, String title, String subtitle, String details) {
		this.id = id;
		this.photo = photo;
		this.title = title;
		this.subtitle = subtitle;
		this.details = details;
	}

	public Review() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}