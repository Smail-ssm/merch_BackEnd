package com.xdev.merch.model.entity;

public class Language {

	private int id;
	private boolean isDefault;
	private String language;
	private String file;
	public Language(int id, boolean isDefault, String language, String file) {
		this.id = id;
		this.isDefault = isDefault;
		this.language = language;
		this.file = file;
	}

	public Language() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}