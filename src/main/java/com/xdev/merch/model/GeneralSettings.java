package com.xdev.merch.model.entity;

public class GeneralSettings {

	private int id;
	private String logo;
	private String favicon;
	private String title;
	private String headerEmail;
	private String headerPhone;
	private String footer;
	private String copyright;
	private String colors;
	private String loader;
	private String adminLoader;
	private boolean isTalkTo;
	private String talkTo;
	private boolean isLanguage;
	private boolean isLoader;
	private String mapKey;
	private boolean isDisqus;
	private String disqus;
	private boolean isContact;
	private boolean isFAQ;
	private boolean guestCheckout;
	private boolean stripeCheck;
	private boolean codCheck;
	private String stripeKey;
	private String stripeSecret;
	private boolean currencyFormat;
	private double withdrawFee;
	private double withdrawCharge;
	private double tax;
	private double shippingCost;
	private String smtpHost;
	private String smtpPort;
	private String smtpUser;
	private String smtpPass;
	private String fromEmail;
	private String fromName;
	private boolean isSMTP;
	private boolean isComment;
	private boolean isCurrency;
	private String addCart;
	private String outStock;
	private String addWish;
	private String alreadyWish;
	private String wishRemove;
	private String addCompare;
	private String alreadyCompare;
	private String compareRemove;
	private String colorChange;
	private String couponFound;
	private String noCoupon;
	private String alreadyCoupon;
	private String orderTitle;
	private String orderText;
	private boolean isAffiliate;
	private int affiliateCharge;
	private String affiliateBanner;
	private String alreadyCart;
	private double fixedCommission;
	private double percentageCommission;
	private boolean multipleShipping;
	private boolean multiplePackaging;
	private boolean vendorShipInfo;
	private boolean regVendor;
	private String codText;
	private String paypalText;
	private String stripeText;
	private String headerColor;
	private String footerColor;
	private String copyrightColor;
	private boolean isAdminLoader;
	private String menuColor;
	private String menuHoverColor;
	private boolean isHome;
	private boolean isVerificationEmail;
	private String instamojoKey;
	private String instamojoToken;
	private String instamojoText;
	private boolean isInstamojo;
	private boolean instamojoSandbox;
	private boolean isPaystack;
	private String paystackKey;
	private String paystackEmail;
	private String paystackText;
	private int wholesell;
	private boolean isCapcha;
	private String errorBanner;
	private boolean isPopup;
	private String popupTitle;
	private String popupText;
	private String popupBackground;
	private String invoiceLogo;
	private String userImage;
	private String vendorColor;
	private boolean isSecure;
	private boolean isReport;
	private boolean paypalCheck;
	private String paypalBusiness;
	private String footerLogo;
	private String emailEncryption;
	private String paytmMerchant;
	private String paytmSecret;
	private String paytmWebsite;
	private String paytmIndustry;
	private int isPaytm;
	private String paytmText;
	private String paytmMode;
	private boolean isMolly;
	private String mollyKey;
	private String mollyText;
	private int isRazorpay;
	private String razorpayKey;
	private String razorpaySecret;
	private String razorpayText;
	private boolean showStock;
	private boolean isMaintain;
	private String maintainText;
	public GeneralSettings(int id, String logo, String favicon, String title, String headerEmail, String headerPhone, String footer, String copyright, String colors, String loader, String adminLoader, boolean isTalkTo, String talkTo, boolean isLanguage, boolean isLoader, String mapKey, boolean isDisqus, String disqus, boolean isContact, boolean isFAQ, boolean guestCheckout, boolean stripeCheck, boolean codCheck, String stripeKey, String stripeSecret, boolean currencyFormat, double withdrawFee, double withdrawCharge, double tax, double shippingCost, String smtpHost, String smtpPort, String smtpUser, String smtpPass, String fromEmail, String fromName, boolean isSMTP, boolean isComment, boolean isCurrency, String addCart, String outStock, String addWish, String alreadyWish, String wishRemove, String addCompare, String alreadyCompare, String compareRemove, String colorChange, String couponFound, String noCoupon, String alreadyCoupon, String orderTitle, String orderText, boolean isAffiliate, int affiliateCharge, String affiliateBanner, String alreadyCart, double fixedCommission, double percentageCommission, boolean multipleShipping, boolean multiplePackaging, boolean vendorShipInfo, boolean regVendor, String codText, String paypalText, String stripeText, String headerColor, String footerColor, String copyrightColor, boolean isAdminLoader, String menuColor, String menuHoverColor, boolean isHome, boolean isVerificationEmail, String instamojoKey, String instamojoToken, String instamojoText, boolean isInstamojo, boolean instamojoSandbox, boolean isPaystack, String paystackKey, String paystackEmail, String paystackText, int wholesell, boolean isCapcha, String errorBanner, boolean isPopup, String popupTitle, String popupText, String popupBackground, String invoiceLogo, String userImage, String vendorColor, boolean isSecure, boolean isReport, boolean paypalCheck, String paypalBusiness, String footerLogo, String emailEncryption, String paytmMerchant, String paytmSecret, String paytmWebsite, String paytmIndustry, int isPaytm, String paytmText, String paytmMode, boolean isMolly, String mollyKey, String mollyText, int isRazorpay, String razorpayKey, String razorpaySecret, String razorpayText, boolean showStock, boolean isMaintain, String maintainText) {
		this.id = id;
		this.logo = logo;
		this.favicon = favicon;
		this.title = title;
		this.headerEmail = headerEmail;
		this.headerPhone = headerPhone;
		this.footer = footer;
		this.copyright = copyright;
		this.colors = colors;
		this.loader = loader;
		this.adminLoader = adminLoader;
		this.isTalkTo = isTalkTo;
		this.talkTo = talkTo;
		this.isLanguage = isLanguage;
		this.isLoader = isLoader;
		this.mapKey = mapKey;
		this.isDisqus = isDisqus;
		this.disqus = disqus;
		this.isContact = isContact;
		this.isFAQ = isFAQ;
		this.guestCheckout = guestCheckout;
		this.stripeCheck = stripeCheck;
		this.codCheck = codCheck;
		this.stripeKey = stripeKey;
		this.stripeSecret = stripeSecret;
		this.currencyFormat = currencyFormat;
		this.withdrawFee = withdrawFee;
		this.withdrawCharge = withdrawCharge;
		this.tax = tax;
		this.shippingCost = shippingCost;
		this.smtpHost = smtpHost;
		this.smtpPort = smtpPort;
		this.smtpUser = smtpUser;
		this.smtpPass = smtpPass;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.isSMTP = isSMTP;
		this.isComment = isComment;
		this.isCurrency = isCurrency;
		this.addCart = addCart;
		this.outStock = outStock;
		this.addWish = addWish;
		this.alreadyWish = alreadyWish;
		this.wishRemove = wishRemove;
		this.addCompare = addCompare;
		this.alreadyCompare = alreadyCompare;
		this.compareRemove = compareRemove;
		this.colorChange = colorChange;
		this.couponFound = couponFound;
		this.noCoupon = noCoupon;
		this.alreadyCoupon = alreadyCoupon;
		this.orderTitle = orderTitle;
		this.orderText = orderText;
		this.isAffiliate = isAffiliate;
		this.affiliateCharge = affiliateCharge;
		this.affiliateBanner = affiliateBanner;
		this.alreadyCart = alreadyCart;
		this.fixedCommission = fixedCommission;
		this.percentageCommission = percentageCommission;
		this.multipleShipping = multipleShipping;
		this.multiplePackaging = multiplePackaging;
		this.vendorShipInfo = vendorShipInfo;
		this.regVendor = regVendor;
		this.codText = codText;
		this.paypalText = paypalText;
		this.stripeText = stripeText;
		this.headerColor = headerColor;
		this.footerColor = footerColor;
		this.copyrightColor = copyrightColor;
		this.isAdminLoader = isAdminLoader;
		this.menuColor = menuColor;
		this.menuHoverColor = menuHoverColor;
		this.isHome = isHome;
		this.isVerificationEmail = isVerificationEmail;
		this.instamojoKey = instamojoKey;
		this.instamojoToken = instamojoToken;
		this.instamojoText = instamojoText;
		this.isInstamojo = isInstamojo;
		this.instamojoSandbox = instamojoSandbox;
		this.isPaystack = isPaystack;
		this.paystackKey = paystackKey;
		this.paystackEmail = paystackEmail;
		this.paystackText = paystackText;
		this.wholesell = wholesell;
		this.isCapcha = isCapcha;
		this.errorBanner = errorBanner;
		this.isPopup = isPopup;
		this.popupTitle = popupTitle;
		this.popupText = popupText;
		this.popupBackground = popupBackground;
		this.invoiceLogo = invoiceLogo;
		this.userImage = userImage;
		this.vendorColor = vendorColor;
		this.isSecure = isSecure;
		this.isReport = isReport;
		this.paypalCheck = paypalCheck;
		this.paypalBusiness = paypalBusiness;
		this.footerLogo = footerLogo;
		this.emailEncryption = emailEncryption;
		this.paytmMerchant = paytmMerchant;
		this.paytmSecret = paytmSecret;
		this.paytmWebsite = paytmWebsite;
		this.paytmIndustry = paytmIndustry;
		this.isPaytm = isPaytm;
		this.paytmText = paytmText;
		this.paytmMode = paytmMode;
		this.isMolly = isMolly;
		this.mollyKey = mollyKey;
		this.mollyText = mollyText;
		this.isRazorpay = isRazorpay;
		this.razorpayKey = razorpayKey;
		this.razorpaySecret = razorpaySecret;
		this.razorpayText = razorpayText;
		this.showStock = showStock;
		this.isMaintain = isMaintain;
		this.maintainText = maintainText;
	}

	public GeneralSettings() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getFavicon() {
		return favicon;
	}

	public void setFavicon(String favicon) {
		this.favicon = favicon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeaderEmail() {
		return headerEmail;
	}

	public void setHeaderEmail(String headerEmail) {
		this.headerEmail = headerEmail;
	}

	public String getHeaderPhone() {
		return headerPhone;
	}

	public void setHeaderPhone(String headerPhone) {
		this.headerPhone = headerPhone;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getLoader() {
		return loader;
	}

	public void setLoader(String loader) {
		this.loader = loader;
	}

	public String getAdminLoader() {
		return adminLoader;
	}

	public void setAdminLoader(String adminLoader) {
		this.adminLoader = adminLoader;
	}

	public boolean getIsTalkTo() {
		return isTalkTo;
	}

	public void setIsTalkTo(boolean isTalkTo) {
		this.isTalkTo = isTalkTo;
	}

	public String getTalkTo() {
		return talkTo;
	}

	public void setTalkTo(String talkTo) {
		this.talkTo = talkTo;
	}

	public boolean getIsLanguage() {
		return isLanguage;
	}

	public void setIsLanguage(boolean isLanguage) {
		this.isLanguage = isLanguage;
	}

	public boolean getIsLoader() {
		return isLoader;
	}

	public void setIsLoader(boolean isLoader) {
		this.isLoader = isLoader;
	}

	public String getMapKey() {
		return mapKey;
	}

	public void setMapKey(String mapKey) {
		this.mapKey = mapKey;
	}

	public boolean getIsDisqus() {
		return isDisqus;
	}

	public void setIsDisqus(boolean isDisqus) {
		this.isDisqus = isDisqus;
	}

	public String getDisqus() {
		return disqus;
	}

	public void setDisqus(String disqus) {
		this.disqus = disqus;
	}

	public boolean getIsContact() {
		return isContact;
	}

	public void setIsContact(boolean isContact) {
		this.isContact = isContact;
	}

	public boolean getIsFAQ() {
		return isFAQ;
	}

	public void setIsFAQ(boolean isFAQ) {
		this.isFAQ = isFAQ;
	}

	public boolean getGuestCheckout() {
		return guestCheckout;
	}

	public void setGuestCheckout(boolean guestCheckout) {
		this.guestCheckout = guestCheckout;
	}

	public boolean getStripeCheck() {
		return stripeCheck;
	}

	public void setStripeCheck(boolean stripeCheck) {
		this.stripeCheck = stripeCheck;
	}

	public boolean getCodCheck() {
		return codCheck;
	}

	public void setCodCheck(boolean codCheck) {
		this.codCheck = codCheck;
	}

	public String getStripeKey() {
		return stripeKey;
	}

	public void setStripeKey(String stripeKey) {
		this.stripeKey = stripeKey;
	}

	public String getStripeSecret() {
		return stripeSecret;
	}

	public void setStripeSecret(String stripeSecret) {
		this.stripeSecret = stripeSecret;
	}

	public boolean getCurrencyFormat() {
		return currencyFormat;
	}

	public void setCurrencyFormat(boolean currencyFormat) {
		this.currencyFormat = currencyFormat;
	}

	public double getWithdrawFee() {
		return withdrawFee;
	}

	public void setWithdrawFee(double withdrawFee) {
		this.withdrawFee = withdrawFee;
	}

	public double getWithdrawCharge() {
		return withdrawCharge;
	}

	public void setWithdrawCharge(double withdrawCharge) {
		this.withdrawCharge = withdrawCharge;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmtpUser() {
		return smtpUser;
	}

	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}

	public String getSmtpPass() {
		return smtpPass;
	}

	public void setSmtpPass(String smtpPass) {
		this.smtpPass = smtpPass;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public boolean getIsSMTP() {
		return isSMTP;
	}

	public void setIsSMTP(boolean isSMTP) {
		this.isSMTP = isSMTP;
	}

	public boolean getIsComment() {
		return isComment;
	}

	public void setIsComment(boolean isComment) {
		this.isComment = isComment;
	}

	public boolean getIsCurrency() {
		return isCurrency;
	}

	public void setIsCurrency(boolean isCurrency) {
		this.isCurrency = isCurrency;
	}

	public String getAddCart() {
		return addCart;
	}

	public void setAddCart(String addCart) {
		this.addCart = addCart;
	}

	public String getOutStock() {
		return outStock;
	}

	public void setOutStock(String outStock) {
		this.outStock = outStock;
	}

	public String getAddWish() {
		return addWish;
	}

	public void setAddWish(String addWish) {
		this.addWish = addWish;
	}

	public String getAlreadyWish() {
		return alreadyWish;
	}

	public void setAlreadyWish(String alreadyWish) {
		this.alreadyWish = alreadyWish;
	}

	public String getWishRemove() {
		return wishRemove;
	}

	public void setWishRemove(String wishRemove) {
		this.wishRemove = wishRemove;
	}

	public String getAddCompare() {
		return addCompare;
	}

	public void setAddCompare(String addCompare) {
		this.addCompare = addCompare;
	}

	public String getAlreadyCompare() {
		return alreadyCompare;
	}

	public void setAlreadyCompare(String alreadyCompare) {
		this.alreadyCompare = alreadyCompare;
	}

	public String getCompareRemove() {
		return compareRemove;
	}

	public void setCompareRemove(String compareRemove) {
		this.compareRemove = compareRemove;
	}

	public String getColorChange() {
		return colorChange;
	}

	public void setColorChange(String colorChange) {
		this.colorChange = colorChange;
	}

	public String getCouponFound() {
		return couponFound;
	}

	public void setCouponFound(String couponFound) {
		this.couponFound = couponFound;
	}

	public String getNoCoupon() {
		return noCoupon;
	}

	public void setNoCoupon(String noCoupon) {
		this.noCoupon = noCoupon;
	}

	public String getAlreadyCoupon() {
		return alreadyCoupon;
	}

	public void setAlreadyCoupon(String alreadyCoupon) {
		this.alreadyCoupon = alreadyCoupon;
	}

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOrderText() {
		return orderText;
	}

	public void setOrderText(String orderText) {
		this.orderText = orderText;
	}

	public boolean getIsAffiliate() {
		return isAffiliate;
	}

	public void setIsAffiliate(boolean isAffiliate) {
		this.isAffiliate = isAffiliate;
	}

	public int getAffiliateCharge() {
		return affiliateCharge;
	}

	public void setAffiliateCharge(int affiliateCharge) {
		this.affiliateCharge = affiliateCharge;
	}

	public String getAffiliateBanner() {
		return affiliateBanner;
	}

	public void setAffiliateBanner(String affiliateBanner) {
		this.affiliateBanner = affiliateBanner;
	}

	public String getAlreadyCart() {
		return alreadyCart;
	}

	public void setAlreadyCart(String alreadyCart) {
		this.alreadyCart = alreadyCart;
	}

	public double getFixedCommission() {
		return fixedCommission;
	}

	public void setFixedCommission(double fixedCommission) {
		this.fixedCommission = fixedCommission;
	}

	public double getPercentageCommission() {
		return percentageCommission;
	}

	public void setPercentageCommission(double percentageCommission) {
		this.percentageCommission = percentageCommission;
	}

	public boolean getMultipleShipping() {
		return multipleShipping;
	}

	public void setMultipleShipping(boolean multipleShipping) {
		this.multipleShipping = multipleShipping;
	}

	public boolean getMultiplePackaging() {
		return multiplePackaging;
	}

	public void setMultiplePackaging(boolean multiplePackaging) {
		this.multiplePackaging = multiplePackaging;
	}

	public boolean getVendorShipInfo() {
		return vendorShipInfo;
	}

	public void setVendorShipInfo(boolean vendorShipInfo) {
		this.vendorShipInfo = vendorShipInfo;
	}

	public boolean getRegVendor() {
		return regVendor;
	}

	public void setRegVendor(boolean regVendor) {
		this.regVendor = regVendor;
	}

	public String getCodText() {
		return codText;
	}

	public void setCodText(String codText) {
		this.codText = codText;
	}

	public String getPaypalText() {
		return paypalText;
	}

	public void setPaypalText(String paypalText) {
		this.paypalText = paypalText;
	}

	public String getStripeText() {
		return stripeText;
	}

	public void setStripeText(String stripeText) {
		this.stripeText = stripeText;
	}

	public String getHeaderColor() {
		return headerColor;
	}

	public void setHeaderColor(String headerColor) {
		this.headerColor = headerColor;
	}

	public String getFooterColor() {
		return footerColor;
	}

	public void setFooterColor(String footerColor) {
		this.footerColor = footerColor;
	}

	public String getCopyrightColor() {
		return copyrightColor;
	}

	public void setCopyrightColor(String copyrightColor) {
		this.copyrightColor = copyrightColor;
	}

	public boolean getIsAdminLoader() {
		return isAdminLoader;
	}

	public void setIsAdminLoader(boolean isAdminLoader) {
		this.isAdminLoader = isAdminLoader;
	}

	public String getMenuColor() {
		return menuColor;
	}

	public void setMenuColor(String menuColor) {
		this.menuColor = menuColor;
	}

	public String getMenuHoverColor() {
		return menuHoverColor;
	}

	public void setMenuHoverColor(String menuHoverColor) {
		this.menuHoverColor = menuHoverColor;
	}

	public boolean getIsHome() {
		return isHome;
	}

	public void setIsHome(boolean isHome) {
		this.isHome = isHome;
	}

	public boolean getIsVerificationEmail() {
		return isVerificationEmail;
	}

	public void setIsVerificationEmail(boolean isVerificationEmail) {
		this.isVerificationEmail = isVerificationEmail;
	}

	public String getInstamojoKey() {
		return instamojoKey;
	}

	public void setInstamojoKey(String instamojoKey) {
		this.instamojoKey = instamojoKey;
	}

	public String getInstamojoToken() {
		return instamojoToken;
	}

	public void setInstamojoToken(String instamojoToken) {
		this.instamojoToken = instamojoToken;
	}

	public String getInstamojoText() {
		return instamojoText;
	}

	public void setInstamojoText(String instamojoText) {
		this.instamojoText = instamojoText;
	}

	public boolean getIsInstamojo() {
		return isInstamojo;
	}

	public void setIsInstamojo(boolean isInstamojo) {
		this.isInstamojo = isInstamojo;
	}

	public boolean getInstamojoSandbox() {
		return instamojoSandbox;
	}

	public void setInstamojoSandbox(boolean instamojoSandbox) {
		this.instamojoSandbox = instamojoSandbox;
	}

	public boolean getIsPaystack() {
		return isPaystack;
	}

	public void setIsPaystack(boolean isPaystack) {
		this.isPaystack = isPaystack;
	}

	public String getPaystackKey() {
		return paystackKey;
	}

	public void setPaystackKey(String paystackKey) {
		this.paystackKey = paystackKey;
	}

	public String getPaystackEmail() {
		return paystackEmail;
	}

	public void setPaystackEmail(String paystackEmail) {
		this.paystackEmail = paystackEmail;
	}

	public String getPaystackText() {
		return paystackText;
	}

	public void setPaystackText(String paystackText) {
		this.paystackText = paystackText;
	}

	public int getWholesell() {
		return wholesell;
	}

	public void setWholesell(int wholesell) {
		this.wholesell = wholesell;
	}

	public boolean getIsCapcha() {
		return isCapcha;
	}

	public void setIsCapcha(boolean isCapcha) {
		this.isCapcha = isCapcha;
	}

	public String getErrorBanner() {
		return errorBanner;
	}

	public void setErrorBanner(String errorBanner) {
		this.errorBanner = errorBanner;
	}

	public boolean getIsPopup() {
		return isPopup;
	}

	public void setIsPopup(boolean isPopup) {
		this.isPopup = isPopup;
	}

	public String getPopupTitle() {
		return popupTitle;
	}

	public void setPopupTitle(String popupTitle) {
		this.popupTitle = popupTitle;
	}

	public String getPopupText() {
		return popupText;
	}

	public void setPopupText(String popupText) {
		this.popupText = popupText;
	}

	public String getPopupBackground() {
		return popupBackground;
	}

	public void setPopupBackground(String popupBackground) {
		this.popupBackground = popupBackground;
	}

	public String getInvoiceLogo() {
		return invoiceLogo;
	}

	public void setInvoiceLogo(String invoiceLogo) {
		this.invoiceLogo = invoiceLogo;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getVendorColor() {
		return vendorColor;
	}

	public void setVendorColor(String vendorColor) {
		this.vendorColor = vendorColor;
	}

	public boolean getIsSecure() {
		return isSecure;
	}

	public void setIsSecure(boolean isSecure) {
		this.isSecure = isSecure;
	}

	public boolean getIsReport() {
		return isReport;
	}

	public void setIsReport(boolean isReport) {
		this.isReport = isReport;
	}

	public boolean getPaypalCheck() {
		return paypalCheck;
	}

	public void setPaypalCheck(boolean paypalCheck) {
		this.paypalCheck = paypalCheck;
	}

	public String getPaypalBusiness() {
		return paypalBusiness;
	}

	public void setPaypalBusiness(String paypalBusiness) {
		this.paypalBusiness = paypalBusiness;
	}

	public String getFooterLogo() {
		return footerLogo;
	}

	public void setFooterLogo(String footerLogo) {
		this.footerLogo = footerLogo;
	}

	public String getEmailEncryption() {
		return emailEncryption;
	}

	public void setEmailEncryption(String emailEncryption) {
		this.emailEncryption = emailEncryption;
	}

	public String getPaytmMerchant() {
		return paytmMerchant;
	}

	public void setPaytmMerchant(String paytmMerchant) {
		this.paytmMerchant = paytmMerchant;
	}

	public String getPaytmSecret() {
		return paytmSecret;
	}

	public void setPaytmSecret(String paytmSecret) {
		this.paytmSecret = paytmSecret;
	}

	public String getPaytmWebsite() {
		return paytmWebsite;
	}

	public void setPaytmWebsite(String paytmWebsite) {
		this.paytmWebsite = paytmWebsite;
	}

	public String getPaytmIndustry() {
		return paytmIndustry;
	}

	public void setPaytmIndustry(String paytmIndustry) {
		this.paytmIndustry = paytmIndustry;
	}

	public int getIsPaytm() {
		return isPaytm;
	}

	public void setIsPaytm(int isPaytm) {
		this.isPaytm = isPaytm;
	}

	public String getPaytmText() {
		return paytmText;
	}

	public void setPaytmText(String paytmText) {
		this.paytmText = paytmText;
	}

	public String getPaytmMode() {
		return paytmMode;
	}

	public void setPaytmMode(String paytmMode) {
		this.paytmMode = paytmMode;
	}

	public boolean getIsMolly() {
		return isMolly;
	}

	public void setIsMolly(boolean isMolly) {
		this.isMolly = isMolly;
	}

	public String getMollyKey() {
		return mollyKey;
	}

	public void setMollyKey(String mollyKey) {
		this.mollyKey = mollyKey;
	}

	public String getMollyText() {
		return mollyText;
	}

	public void setMollyText(String mollyText) {
		this.mollyText = mollyText;
	}

	public int getIsRazorpay() {
		return isRazorpay;
	}

	public void setIsRazorpay(int isRazorpay) {
		this.isRazorpay = isRazorpay;
	}

	public String getRazorpayKey() {
		return razorpayKey;
	}

	public void setRazorpayKey(String razorpayKey) {
		this.razorpayKey = razorpayKey;
	}

	public String getRazorpaySecret() {
		return razorpaySecret;
	}

	public void setRazorpaySecret(String razorpaySecret) {
		this.razorpaySecret = razorpaySecret;
	}

	public String getRazorpayText() {
		return razorpayText;
	}

	public void setRazorpayText(String razorpayText) {
		this.razorpayText = razorpayText;
	}

	public boolean getShowStock() {
		return showStock;
	}

	public void setShowStock(boolean showStock) {
		this.showStock = showStock;
	}

	public boolean getIsMaintain() {
		return isMaintain;
	}

	public void setIsMaintain(boolean isMaintain) {
		this.isMaintain = isMaintain;
	}

	public String getMaintainText() {
		return maintainText;
	}

	public void setMaintainText(String maintainText) {
		this.maintainText = maintainText;
	}

}