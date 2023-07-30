package com.xdev.merch.model.entity;

public class Banner {

	private int id;
	private String photo;
	private String link;
	private String type;
	public Banner(int id, String photo, String link, String type) {
		this.id = id;
		this.photo = photo;
		this.link = link;
		this.type = type;
	}

	public Banner() {
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}