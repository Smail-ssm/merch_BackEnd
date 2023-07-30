package com.xdev.merch.model.entity;

public class Currency {

	private int id;
	private String name;
	private String sign;
	private double value;
	private boolean isDefault;
	public Currency(int id, String name, String sign, double value, boolean isDefault) {
		this.id = id;
		this.name = name;
		this.sign = sign;
		this.value = value;
		this.isDefault = isDefault;
	}

	public Currency() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

}