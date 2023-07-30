package com.xdev.merch.model;

import java.time.LocalDateTime;

public class Rating {

	private int id;
	private int userId;
	private int productId;
	private String review;
	private int rating;
	private LocalDateTime reviewDate;
	public Rating(int id, int userId, int productId, String review, int rating, LocalDateTime reviewDate) {
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.review = review;
		this.rating = rating;
		this.reviewDate = reviewDate;
	}

	public Rating() {
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDateTime getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDateTime reviewDate) {
		this.reviewDate = reviewDate;
	}

}