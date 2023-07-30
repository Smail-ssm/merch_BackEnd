package com.xdev.merch.model;
public class SeoTool {

	private int id;
	private String googleAnalytics;
	private String metaKeys;
	public SeoTool(int id, String googleAnalytics, String metaKeys) {
		this.id = id;
		this.googleAnalytics = googleAnalytics;
		this.metaKeys = metaKeys;
	}

	public SeoTool() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoogleAnalytics() {
		return googleAnalytics;
	}

	public void setGoogleAnalytics(String googleAnalytics) {
		this.googleAnalytics = googleAnalytics;
	}

	public String getMetaKeys() {
		return metaKeys;
	}

	public void setMetaKeys(String metaKeys) {
		this.metaKeys = metaKeys;
	}

}