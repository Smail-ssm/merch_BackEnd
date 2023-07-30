package com.xdev.merch.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String photo;
    private String zip;
    private String city;
    private String country;
    private String address;
    private String phone;
    private String fax;
    private String email;
    private String password;
    private String rememberToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isProvider;
    private int status;
    private String verificationLink;
    private String emailVerified;
    private String affilateCode;
    private double affilateIncome;
    private String shopName;
    private String ownerName;
    private String shopNumber;
    private String shopAddress;
    private String regNumber;
    private String shopMessage;
    private String shopDetails;
    private String shopImage;
    private String fUrl;
    private String gUrl;
    private String tUrl;
    private String lUrl;
    private boolean isVendor;
    private boolean fCheck;
    private boolean gCheck;
    private boolean tCheck;
    private boolean lCheck;
    private boolean mailSent;
    private double shippingCost;
    private double currentBalance;
    private LocalDate date;
    private boolean ban;

    public User(int id, String name, String photo, String zip, String city, String country, String address, String phone, String fax, String email, String password, String rememberToken, LocalDateTime createdAt, LocalDateTime updatedAt, boolean isProvider, int status, String verificationLink, String emailVerified, String affilateCode, double affilateIncome, String shopName, String ownerName, String shopNumber, String shopAddress, String regNumber, String shopMessage, String shopDetails, String shopImage, String fUrl, String gUrl, String tUrl, String lUrl, boolean isVendor, boolean fCheck, boolean gCheck, boolean tCheck, boolean lCheck, boolean mailSent, double shippingCost, double currentBalance, LocalDate date, boolean ban) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.password = password;
        this.rememberToken = rememberToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isProvider = isProvider;
        this.status = status;
        this.verificationLink = verificationLink;
        this.emailVerified = emailVerified;
        this.affilateCode = affilateCode;
        this.affilateIncome = affilateIncome;
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopNumber = shopNumber;
        this.shopAddress = shopAddress;
        this.regNumber = regNumber;
        this.shopMessage = shopMessage;
        this.shopDetails = shopDetails;
        this.shopImage = shopImage;
        this.fUrl = fUrl;
        this.gUrl = gUrl;
        this.tUrl = tUrl;
        this.lUrl = lUrl;
        this.isVendor = isVendor;
        this.fCheck = fCheck;
        this.gCheck = gCheck;
        this.tCheck = tCheck;
        this.lCheck = lCheck;
        this.mailSent = mailSent;
        this.shippingCost = shippingCost;
        this.currentBalance = currentBalance;
        this.date = date;
        this.ban = ban;
    }

    public User() {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
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

    public boolean getIsProvider() {
        return isProvider;
    }

    public void setIsProvider(boolean isProvider) {
        this.isProvider = isProvider;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVerificationLink() {
        return verificationLink;
    }

    public void setVerificationLink(String verificationLink) {
        this.verificationLink = verificationLink;
    }

    public String getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(String emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getAffilateCode() {
        return affilateCode;
    }

    public void setAffilateCode(String affilateCode) {
        this.affilateCode = affilateCode;
    }

    public double getAffilateIncome() {
        return affilateIncome;
    }

    public void setAffilateIncome(double affilateIncome) {
        this.affilateIncome = affilateIncome;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getShopMessage() {
        return shopMessage;
    }

    public void setShopMessage(String shopMessage) {
        this.shopMessage = shopMessage;
    }

    public String getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(String shopDetails) {
        this.shopDetails = shopDetails;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public String getFUrl() {
        return fUrl;
    }

    public void setFUrl(String fUrl) {
        this.fUrl = fUrl;
    }

    public String getGUrl() {
        return gUrl;
    }

    public void setGUrl(String gUrl) {
        this.gUrl = gUrl;
    }

    public String getTUrl() {
        return tUrl;
    }

    public void setTUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    public String getLUrl() {
        return lUrl;
    }

    public void setLUrl(String lUrl) {
        this.lUrl = lUrl;
    }

    public boolean getIsVendor() {
        return isVendor;
    }

    public void setIsVendor(boolean isVendor) {
        this.isVendor = isVendor;
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

    public boolean getTCheck() {
        return tCheck;
    }

    public void setTCheck(boolean tCheck) {
        this.tCheck = tCheck;
    }

    public boolean getLCheck() {
        return lCheck;
    }

    public void setLCheck(boolean lCheck) {
        this.lCheck = lCheck;
    }

    public boolean getMailSent() {
        return mailSent;
    }

    public void setMailSent(boolean mailSent) {
        this.mailSent = mailSent;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean getBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

}