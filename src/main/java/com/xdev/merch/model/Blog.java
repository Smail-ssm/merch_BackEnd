package com.xdev.merch.model.entity;

public class Blog {

	private int id;
	private int categoryId;
	private String title;
	private String details;
	private String photo;
	private String source;
	private int views;
	private boolean status;
	private String metaTag;
	private String metaDescription;
	private String tags;
	private Timestamp createdAt;
	public Blog(int id, int categoryId, String title, String details, String photo, String source, int views, boolean status, String metaTag, String metaDescription, String tags, Timestamp createdAt) {
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.details = details;
		this.photo = photo;
		this.source = source;
		this.views = views;
		this.status = status;
		this.metaTag = metaTag;
		this.metaDescription = metaDescription;
		this.tags = tags;
		this.createdAt = createdAt;
	}

	public Blog() {
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(String metaTag) {
		this.metaTag = metaTag;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}