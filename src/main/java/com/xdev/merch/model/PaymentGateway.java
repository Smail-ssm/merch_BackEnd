package com.xdev.merch.model.entity;

public class PaymentGateway {

	private int id;
	private String subtitle;
	private String title;
	private String details;
	private boolean status;
	public PaymentGateway(int id, String subtitle, String title, String details, boolean status) {
		this.id = id;
		this.subtitle = subtitle;
		this.title = title;
		this.details = details;
		this.status = status;
	}

	public PaymentGateway() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
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