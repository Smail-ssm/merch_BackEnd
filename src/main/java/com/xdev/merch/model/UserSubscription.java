package com.xdev.merch.model;

import java.time.LocalDateTime;

public class UserSubscription {

	private int id;
	private int userId;
	private int subscriptionId;
	private String title;
	private String currency;
	private String currencyCode;
	private double price;
	private int days;
	private int allowedProducts;
	private String details;
	private String method;
	private String txnid;
	private String chargeId;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private int status;
	private String paymentNumber;
	public UserSubscription(int id, int userId, int subscriptionId, String title, String currency, String currencyCode, double price, int days, int allowedProducts, String details, String method, String txnid, String chargeId, LocalDateTime createdAt, LocalDateTime updatedAt, int status, String paymentNumber) {
		this.id = id;
		this.userId = userId;
		this.subscriptionId = subscriptionId;
		this.title = title;
		this.currency = currency;
		this.currencyCode = currencyCode;
		this.price = price;
		this.days = days;
		this.allowedProducts = allowedProducts;
		this.details = details;
		this.method = method;
		this.txnid = txnid;
		this.chargeId = chargeId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.paymentNumber = paymentNumber;
	}

	public UserSubscription() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getAllowedProducts() {
		return allowedProducts;
	}

	public void setAllowedProducts(int allowedProducts) {
		this.allowedProducts = allowedProducts;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTxnid() {
		return txnid;
	}

	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

}