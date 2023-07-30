package com.xdev.merch.model;
public class Maintain {

	private int id;
	private boolean isMaintain;
	public Maintain(int id, boolean isMaintain) {
		this.id = id;
		this.isMaintain = isMaintain;
	}

	public Maintain() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsMaintain() {
		return isMaintain;
	}

	public void setIsMaintain(boolean isMaintain) {
		this.isMaintain = isMaintain;
	}

}