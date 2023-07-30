package com.xdev.merch.model;
public class MollyKey {

	private int id;
	private String key;
	public MollyKey(int id, String key) {
		this.id = id;
		this.key = key;
	}

	public MollyKey() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}