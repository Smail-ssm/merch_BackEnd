package com.xdev.merch.model;
public class BlogCategory {

	private int id;
	private String name;
	private String slug;
	public BlogCategory(int id, String name, String slug) {
		this.id = id;
		this.name = name;
		this.slug = slug;
	}

	public BlogCategory() {
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

}