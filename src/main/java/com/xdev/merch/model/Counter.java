package com.xdev.merch.model;
import java.security.Timestamp;


public class Counter {

	private int id;
	private String type;
	private String referral;
	private int totalCount;
	private int todaysCount;
	private Date today;
	public Counter(int id, String type, String referral, int totalCount, int todaysCount, Date today) {
		this.id = id;
		this.type = type;
		this.referral = referral;
		this.totalCount = totalCount;
		this.todaysCount = todaysCount;
		this.today = today;
	}

	public Counter() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTodaysCount() {
		return todaysCount;
	}

	public void setTodaysCount(int todaysCount) {
		this.todaysCount = todaysCount;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

}