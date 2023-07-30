package com.xdev.merch.model.entity;

import java.security.Timestamp;

public class Admin {

    private int id;
    private String name;
    private String email;
    private String phone;
    private int roleId;
    private String photo;
    private String password;
    private boolean status;
    private String rememberToken;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String shopName;

    public Admin(int id, String name, String email, String phone, int roleId, String photo, String password, boolean status, String rememberToken, Timestamp createdAt, Timestamp updatedAt, String shopName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
        this.photo = photo;
        this.password = password;
        this.status = status;
        this.rememberToken = rememberToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.shopName = shopName;
    }

    public Admin() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}