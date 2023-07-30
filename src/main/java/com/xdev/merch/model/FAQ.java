package com.xdev.merch.model;
public class FAQ {

	private int id;
	private String title;
	private String details;
	private boolean status;
	public FAQ(int id, String title, String details, boolean status) {
		this.id = id;
		this.title = title;
		this.details = details;
		this.status = status;
	}

	public FAQ() {
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}