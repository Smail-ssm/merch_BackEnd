package com.xdev.merch.model.entity;

public class EmailTemplate {

	private int id;
	private String emailType;
	private String emailSubject;
	private String emailBody;
	private int status;
	public EmailTemplate(int id, String emailType, String emailSubject, String emailBody, int status) {
		this.id = id;
		this.emailType = emailType;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.status = status;
	}

	public EmailTemplate() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}