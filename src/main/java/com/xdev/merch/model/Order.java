package com.xdev.merch.model;
import java.security.Timestamp;


public class Order {

	private int id;
	private int userId;
	private String cart;
	private String method;
	private String shipping;
	private String pickupLocation;
	private String totalQty;
	private float payAmount;
	private String txnid;
	private String chargeId;
	private String orderNumber;
	private String paymentStatus;
	private String customerEmail;
	private String customerName;
	private String customerCountry;
	private String customerPhone;
	private String customerAddress;
	private String customerCity;
	private String customerZip;
	private String shippingName;
	private String shippingCountry;
	private String shippingEmail;
	private String shippingPhone;
	private String shippingAddress;
	private String shippingCity;
	private String shippingZip;
	private String orderNote;
	private String couponCode;
	private String couponDiscount;
	private String status;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String affilateUser;
	private String affilateCharge;
	private String currencySign;
	private double currencyValue;
	private double shippingCost;
	private double packingCost;
	private int tax;
	private boolean dp;
	private String payId;
	private int vendorShippingId;
	private int vendorPackingId;
	public Order(int id, int userId, String cart, String method, String shipping, String pickupLocation, String totalQty, float payAmount, String txnid, String chargeId, String orderNumber, String paymentStatus, String customerEmail, String customerName, String customerCountry, String customerPhone, String customerAddress, String customerCity, String customerZip, String shippingName, String shippingCountry, String shippingEmail, String shippingPhone, String shippingAddress, String shippingCity, String shippingZip, String orderNote, String couponCode, String couponDiscount, String status, Timestamp createdAt, Timestamp updatedAt, String affilateUser, String affilateCharge, String currencySign, double currencyValue, double shippingCost, double packingCost, int tax, boolean dp, String payId, int vendorShippingId, int vendorPackingId) {
		this.id = id;
		this.userId = userId;
		this.cart = cart;
		this.method = method;
		this.shipping = shipping;
		this.pickupLocation = pickupLocation;
		this.totalQty = totalQty;
		this.payAmount = payAmount;
		this.txnid = txnid;
		this.chargeId = chargeId;
		this.orderNumber = orderNumber;
		this.paymentStatus = paymentStatus;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerCountry = customerCountry;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerZip = customerZip;
		this.shippingName = shippingName;
		this.shippingCountry = shippingCountry;
		this.shippingEmail = shippingEmail;
		this.shippingPhone = shippingPhone;
		this.shippingAddress = shippingAddress;
		this.shippingCity = shippingCity;
		this.shippingZip = shippingZip;
		this.orderNote = orderNote;
		this.couponCode = couponCode;
		this.couponDiscount = couponDiscount;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.affilateUser = affilateUser;
		this.affilateCharge = affilateCharge;
		this.currencySign = currencySign;
		this.currencyValue = currencyValue;
		this.shippingCost = shippingCost;
		this.packingCost = packingCost;
		this.tax = tax;
		this.dp = dp;
		this.payId = payId;
		this.vendorShippingId = vendorShippingId;
		this.vendorPackingId = vendorPackingId;
	}

	public Order() {
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

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}

	public float getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(float payAmount) {
		this.payAmount = payAmount;
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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

	public String getShippingName() {
		return shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getShippingEmail() {
		return shippingEmail;
	}

	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}

	public String getShippingPhone() {
		return shippingPhone;
	}

	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingZip() {
		return shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}

	public String getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(String couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getAffilateUser() {
		return affilateUser;
	}

	public void setAffilateUser(String affilateUser) {
		this.affilateUser = affilateUser;
	}

	public String getAffilateCharge() {
		return affilateCharge;
	}

	public void setAffilateCharge(String affilateCharge) {
		this.affilateCharge = affilateCharge;
	}

	public String getCurrencySign() {
		return currencySign;
	}

	public void setCurrencySign(String currencySign) {
		this.currencySign = currencySign;
	}

	public double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(double currencyValue) {
		this.currencyValue = currencyValue;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public double getPackingCost() {
		return packingCost;
	}

	public void setPackingCost(double packingCost) {
		this.packingCost = packingCost;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public boolean getDp() {
		return dp;
	}

	public void setDp(boolean dp) {
		this.dp = dp;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public int getVendorShippingId() {
		return vendorShippingId;
	}

	public void setVendorShippingId(int vendorShippingId) {
		this.vendorShippingId = vendorShippingId;
	}

	public int getVendorPackingId() {
		return vendorPackingId;
	}

	public void setVendorPackingId(int vendorPackingId) {
		this.vendorPackingId = vendorPackingId;
	}

}