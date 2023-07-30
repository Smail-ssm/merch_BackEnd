package com.xdev.merch.model.entity;

public class Coupon {

	private int id;
	private String code;
	private int type;
	private double price;
	private String times;
	private int used;
	private boolean status;
	private Date startDate;
	private Date endDate;
	public Coupon(int id, String code, int type, double price, String times, int used, boolean status, Date startDate, Date endDate) {
		this.id = id;
		this.code = code;
		this.type = type;
		this.price = price;
		this.times = times;
		this.used = used;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Coupon() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}