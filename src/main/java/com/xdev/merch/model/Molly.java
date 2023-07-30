package com.xdev.merch.model;
public class Molly {

	private int id;
	private boolean isMolly;
	public Molly(int id, boolean isMolly) {
		this.id = id;
		this.isMolly = isMolly;
	}

	public Molly() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsMolly() {
		return isMolly;
	}

	public void setIsMolly(boolean isMolly) {
		this.isMolly = isMolly;
	}

}