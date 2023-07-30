package com.xdev.merch.model.entity;

public class EmailEncryption {

	private int id;
	private String encryption;
	public EmailEncryption(int id, String encryption) {
		this.id = id;
		this.encryption = encryption;
	}

	public EmailEncryption() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEncryption() {
		return encryption;
	}

	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}

}