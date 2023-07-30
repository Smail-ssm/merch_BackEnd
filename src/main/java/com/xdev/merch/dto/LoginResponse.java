package com.xdev.merch.dto;

import com.xdev.merch.model.User;

public class LoginResponse {
    private String token;
    private String message;
    private User user; // Include the User object

    public LoginResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginResponse(String token, String message, User user) {
        this.token = token;
        this.message = message;
        this.user = user;
    }
// Getters and setters
    // ...
}
