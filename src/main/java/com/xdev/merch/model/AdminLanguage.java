package com.xdev.merch.model;
public class AdminLanguage {

    private int id;
    private boolean isDefault;
    private String language;
    private String file;
    private String name;
    private boolean rtl;

    public AdminLanguage(int id, boolean isDefault, String language, String file, String name, boolean rtl) {
        this.id = id;
        this.isDefault = isDefault;
        this.language = language;
        this.file = file;
        this.name = name;
        this.rtl = rtl;
    }

    public AdminLanguage() {
        // Constructor logic
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getRtl() {
        return rtl;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }

}