package com.xdev.merch.model;

import java.time.LocalDateTime;

public class Withdraw {

	private int id;
	private int userId;
	private String method;
	private String accEmail;
	private String iban;
	private String country;
	private String accName;
	private String address;
	private String swift;
	private String reference;
	private Double amount;
	private Double fee;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String status;
	private String type;
	public Withdraw(int id, int userId, String method, String accEmail, String iban, String country, String accName, String address, String swift, String reference, Double amount, Double fee, LocalDateTime createdAt, LocalDateTime updatedAt, String status, String type) {
		this.id = id;
		this.userId = userId;
		this.method = method;
		this.accEmail = accEmail;
		this.iban = iban;
		this.country = country;
		this.accName = accName;
		this.address = address;
		this.swift = swift;
		this.reference = reference;
		this.amount = amount;
		this.fee = fee;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.type = type;
	}

	public Withdraw() {
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

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAccEmail() {
		return accEmail;
	}

	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}