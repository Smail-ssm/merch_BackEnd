package com.xdev.merch.model;
public class ChildCategory {

	private int id;
	private int subcategoryId;
	private String name;
	private String slug;
	private boolean status;
	public ChildCategory(int id, int subcategoryId, String name, String slug, boolean status) {
		this.id = id;
		this.subcategoryId = subcategoryId;
		this.name = name;
		this.slug = slug;
		this.status = status;
	}

	public ChildCategory() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
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