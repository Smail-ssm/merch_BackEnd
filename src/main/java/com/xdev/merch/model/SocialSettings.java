package com.xdev.merch.model;
public class SocialSettings {

	private int id;
	private String facebook;
	private String gplus;
	private String twitter;
	private String linkedin;
	private String dribble;
	private boolean fStatus;
	private boolean gStatus;
	private boolean tStatus;
	private boolean lStatus;
	private boolean dStatus;
	private boolean fCheck;
	private boolean gCheck;
	private String fClientId;
	private String fClientSecret;
	private String fRedirect;
	private String gClientId;
	private String gClientSecret;
	private String gRedirect;
	public SocialSettings(int id, String facebook, String gplus, String twitter, String linkedin, String dribble, boolean fStatus, boolean gStatus, boolean tStatus, boolean lStatus, boolean dStatus, boolean fCheck, boolean gCheck, String fClientId, String fClientSecret, String fRedirect, String gClientId, String gClientSecret, String gRedirect) {
		this.id = id;
		this.facebook = facebook;
		this.gplus = gplus;
		this.twitter = twitter;
		this.linkedin = linkedin;
		this.dribble = dribble;
		this.fStatus = fStatus;
		this.gStatus = gStatus;
		this.tStatus = tStatus;
		this.lStatus = lStatus;
		this.dStatus = dStatus;
		this.fCheck = fCheck;
		this.gCheck = gCheck;
		this.fClientId = fClientId;
		this.fClientSecret = fClientSecret;
		this.fRedirect = fRedirect;
		this.gClientId = gClientId;
		this.gClientSecret = gClientSecret;
		this.gRedirect = gRedirect;
	}

	public SocialSettings() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGplus() {
		return gplus;
	}

	public void setGplus(String gplus) {
		this.gplus = gplus;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getDribble() {
		return dribble;
	}

	public void setDribble(String dribble) {
		this.dribble = dribble;
	}

	public boolean getFStatus() {
		return fStatus;
	}

	public void setFStatus(boolean fStatus) {
		this.fStatus = fStatus;
	}

	public boolean getGStatus() {
		return gStatus;
	}

	public void setGStatus(boolean gStatus) {
		this.gStatus = gStatus;
	}

	public boolean getTStatus() {
		return tStatus;
	}

	public void setTStatus(boolean tStatus) {
		this.tStatus = tStatus;
	}

	public boolean getLStatus() {
		return lStatus;
	}

	public void setLStatus(boolean lStatus) {
		this.lStatus = lStatus;
	}

	public boolean getDStatus() {
		return dStatus;
	}

	public void setDStatus(boolean dStatus) {
		this.dStatus = dStatus;
	}

	public boolean getFCheck() {
		return fCheck;
	}

	public void setFCheck(boolean fCheck) {
		this.fCheck = fCheck;
	}

	public boolean getGCheck() {
		return gCheck;
	}

	public void setGCheck(boolean gCheck) {
		this.gCheck = gCheck;
	}

	public String getFClientId() {
		return fClientId;
	}

	public void setFClientId(String fClientId) {
		this.fClientId = fClientId;
	}

	public String getFClientSecret() {
		return fClientSecret;
	}

	public void setFClientSecret(String fClientSecret) {
		this.fClientSecret = fClientSecret;
	}

	public String getFRedirect() {
		return fRedirect;
	}

	public void setFRedirect(String fRedirect) {
		this.fRedirect = fRedirect;
	}

	public String getGClientId() {
		return gClientId;
	}

	public void setGClientId(String gClientId) {
		this.gClientId = gClientId;
	}

	public String getGClientSecret() {
		return gClientSecret;
	}

	public void setGClientSecret(String gClientSecret) {
		this.gClientSecret = gClientSecret;
	}

	public String getGRedirect() {
		return gRedirect;
	}

	public void setGRedirect(String gRedirect) {
		this.gRedirect = gRedirect;
	}

}