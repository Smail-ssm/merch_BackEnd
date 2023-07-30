package com.xdev.merch.model;
public class Page {

	private int id;
	private String title;
	private String slug;
	private String details;
	private String metaTag;
	private String metaDescription;
	private boolean header;
	private boolean footer;
	public Page(int id, String title, String slug, String details, String metaTag, String metaDescription, boolean header, boolean footer) {
		this.id = id;
		this.title = title;
		this.slug = slug;
		this.details = details;
		this.metaTag = metaTag;
		this.metaDescription = metaDescription;
		this.header = header;
		this.footer = footer;
	}

	public Page() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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

	public boolean getHeader() {
		return header;
	}

	public void setHeader(boolean header) {
		this.header = header;
	}

	public boolean getFooter() {
		return footer;
	}

	public void setFooter(boolean footer) {
		this.footer = footer;
	}

}