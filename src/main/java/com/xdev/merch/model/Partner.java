package com.xdev.merch.model;
public class Partner {

	private int id;
	private String photo;
	private String link;
	public Partner(int id, String photo, String link) {
		this.id = id;
		this.photo = photo;
		this.link = link;
	}

	public Partner() {
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

}