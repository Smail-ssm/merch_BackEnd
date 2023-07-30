package com.xdev.merch.model;
public class Subcategory {

	private int id;
	private int categoryId;
	private String name;
	private String slug;
	private boolean status;
	public Subcategory(int id, int categoryId, String name, String slug, boolean status) {
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.slug = slug;
		this.status = status;
	}

	public Subcategory() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

}