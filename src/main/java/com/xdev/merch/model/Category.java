package com.xdev.merch.model.entity;

public class Category {

	private int id;
	private String name;
	private String slug;
	private boolean status;
	private String photo;
	private boolean isFeatured;
	private String image;
	public Category(int id, String name, String slug, boolean status, String photo, boolean isFeatured, String image) {
		this.id = id;
		this.name = name;
		this.slug = slug;
		this.status = status;
		this.photo = photo;
		this.isFeatured = isFeatured;
		this.image = image;
	}

	public Category() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean getIsFeatured() {
		return isFeatured;
	}

	public void setIsFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}