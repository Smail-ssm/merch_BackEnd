package com.xdev.merch.model;
public class Pickup {

	private int id;
	private String location;
	public Pickup(int id, String location) {
		this.id = id;
		this.location = location;
	}

	public Pickup() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}