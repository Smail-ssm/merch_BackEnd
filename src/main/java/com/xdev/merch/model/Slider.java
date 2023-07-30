package com.xdev.merch.model;
public class Slider {

	private int id;
	private String subtitleText;
	private String subtitleSize;
	private String subtitleColor;
	private String subtitleAnime;
	private String titleText;
	private String titleSize;
	private String titleColor;
	private String titleAnime;
	private String detailsText;
	private String detailsSize;
	private String detailsColor;
	private String detailsAnime;
	private String photo;
	private String position;
	private String link;
	public Slider(int id, String subtitleText, String subtitleSize, String subtitleColor, String subtitleAnime, String titleText, String titleSize, String titleColor, String titleAnime, String detailsText, String detailsSize, String detailsColor, String detailsAnime, String photo, String position, String link) {
		this.id = id;
		this.subtitleText = subtitleText;
		this.subtitleSize = subtitleSize;
		this.subtitleColor = subtitleColor;
		this.subtitleAnime = subtitleAnime;
		this.titleText = titleText;
		this.titleSize = titleSize;
		this.titleColor = titleColor;
		this.titleAnime = titleAnime;
		this.detailsText = detailsText;
		this.detailsSize = detailsSize;
		this.detailsColor = detailsColor;
		this.detailsAnime = detailsAnime;
		this.photo = photo;
		this.position = position;
		this.link = link;
	}

	public Slider() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubtitleText() {
		return subtitleText;
	}

	public void setSubtitleText(String subtitleText) {
		this.subtitleText = subtitleText;
	}

	public String getSubtitleSize() {
		return subtitleSize;
	}

	public void setSubtitleSize(String subtitleSize) {
		this.subtitleSize = subtitleSize;
	}

	public String getSubtitleColor() {
		return subtitleColor;
	}

	public void setSubtitleColor(String subtitleColor) {
		this.subtitleColor = subtitleColor;
	}

	public String getSubtitleAnime() {
		return subtitleAnime;
	}

	public void setSubtitleAnime(String subtitleAnime) {
		this.subtitleAnime = subtitleAnime;
	}

	public String getTitleText() {
		return titleText;
	}

	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}

	public String getTitleSize() {
		return titleSize;
	}

	public void setTitleSize(String titleSize) {
		this.titleSize = titleSize;
	}

	public String getTitleColor() {
		return titleColor;
	}

	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}

	public String getTitleAnime() {
		return titleAnime;
	}

	public void setTitleAnime(String titleAnime) {
		this.titleAnime = titleAnime;
	}

	public String getDetailsText() {
		return detailsText;
	}

	public void setDetailsText(String detailsText) {
		this.detailsText = detailsText;
	}

	public String getDetailsSize() {
		return detailsSize;
	}

	public void setDetailsSize(String detailsSize) {
		this.detailsSize = detailsSize;
	}

	public String getDetailsColor() {
		return detailsColor;
	}

	public void setDetailsColor(String detailsColor) {
		this.detailsColor = detailsColor;
	}

	public String getDetailsAnime() {
		return detailsAnime;
	}

	public void setDetailsAnime(String detailsAnime) {
		this.detailsAnime = detailsAnime;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}