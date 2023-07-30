package com.xdev.merch.dto;
// LoginRequest.java
public class LoginRequest {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoginRequest(String username, String password) {
        this.email = username;
        this.password = password;
    }
  public LoginRequest( ) {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
// Getters and setters
}
