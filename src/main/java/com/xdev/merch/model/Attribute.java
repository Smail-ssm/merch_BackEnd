package com.xdev.merch.model.entity;

public class Attribute {

	private int id;
	private int attributableId;
	private String attributableType;
	private String name;
	private String inputName;
	private int priceStatus;
	private int detailsStatus;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public Attribute(int id, int attributableId, String attributableType, String name, String inputName, int priceStatus, int detailsStatus, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.attributableId = attributableId;
		this.attributableType = attributableType;
		this.name = name;
		this.inputName = inputName;
		this.priceStatus = priceStatus;
		this.detailsStatus = detailsStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Attribute() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttributableId() {
		return attributableId;
	}

	public void setAttributableId(int attributableId) {
		this.attributableId = attributableId;
	}

	public String getAttributableType() {
		return attributableType;
	}

	public void setAttributableType(String attributableType) {
		this.attributableType = attributableType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public int getPriceStatus() {
		return priceStatus;
	}

	public void setPriceStatus(int priceStatus) {
		this.priceStatus = priceStatus;
	}

	public int getDetailsStatus() {
		return detailsStatus;
	}

	public void setDetailsStatus(int detailsStatus) {
		this.detailsStatus = detailsStatus;
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