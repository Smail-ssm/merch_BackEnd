package com.xdev.merch.model.entity;

public class AttributeOption {

	private int id;
	private int attributeId;
	private String name;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public AttributeOption(int id, int attributeId, String name, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.attributeId = attributeId;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public AttributeOption() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}