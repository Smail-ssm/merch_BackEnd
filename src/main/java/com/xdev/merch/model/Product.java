package com.xdev.merch.model;
import java.security.Timestamp;
import java.time.LocalDateTime;


public class Product {

	private int id;
	private String sku;
	private String productType;
	private String affiliateLink;
	private int userId;
	private int categoryId;
	private int subcategoryId;
	private int childcategoryId;
	private String attributes;
	private String name;
	private String slug;
	private String photo;
	private String thumbnail;
	private String file;
	private String size;
	private String sizeQty;
	private String sizePrice;
	private String color;
	private double price;
	private Double previousPrice;
	private String details;
	private Integer stock;
	private String policy;
	private int status;
	private int views;
	private String tags;
	private String features;
	private String colors;
	private int productCondition;
	private String ship;
	private boolean isMeta;
	private String metaTag;
	private String metaDescription;
	private String youtube;
	private String type;
	private String license;
	private String licenseQty;
	private String link;
	private String platform;
	private String region;
	private String licenceType;
	private String measure;
	private boolean featured;
	private boolean best;
	private boolean top;
	private boolean hot;
	private boolean latest;
	private boolean big;
	private boolean trending;
	private boolean sale;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private boolean isDiscount;
	private String discountDate;
	private String wholeSellQty;
	private String wholeSellDiscount;
	private boolean isCatalog;
	private int catalogId;
	public Product(int id, String sku, String productType, String affiliateLink, int userId, int categoryId, int subcategoryId, int childcategoryId, String attributes, String name, String slug, String photo, String thumbnail, String file, String size, String sizeQty, String sizePrice, String color, double price, Double previousPrice, String details, Integer stock, String policy, int status, int views, String tags, String features, String colors, int productCondition, String ship, boolean isMeta, String metaTag, String metaDescription, String youtube, String type, String license, String licenseQty, String link, String platform, String region, String licenceType, String measure, boolean featured, boolean best, boolean top, boolean hot, boolean latest, boolean big, boolean trending, boolean sale, LocalDateTime createdAt, LocalDateTime updatedAt, boolean isDiscount, String discountDate, String wholeSellQty, String wholeSellDiscount, boolean isCatalog, int catalogId) {
		this.id = id;
		this.sku = sku;
		this.productType = productType;
		this.affiliateLink = affiliateLink;
		this.userId = userId;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.childcategoryId = childcategoryId;
		this.attributes = attributes;
		this.name = name;
		this.slug = slug;
		this.photo = photo;
		this.thumbnail = thumbnail;
		this.file = file;
		this.size = size;
		this.sizeQty = sizeQty;
		this.sizePrice = sizePrice;
		this.color = color;
		this.price = price;
		this.previousPrice = previousPrice;
		this.details = details;
		this.stock = stock;
		this.policy = policy;
		this.status = status;
		this.views = views;
		this.tags = tags;
		this.features = features;
		this.colors = colors;
		this.productCondition = productCondition;
		this.ship = ship;
		this.isMeta = isMeta;
		this.metaTag = metaTag;
		this.metaDescription = metaDescription;
		this.youtube = youtube;
		this.type = type;
		this.license = license;
		this.licenseQty = licenseQty;
		this.link = link;
		this.platform = platform;
		this.region = region;
		this.licenceType = licenceType;
		this.measure = measure;
		this.featured = featured;
		this.best = best;
		this.top = top;
		this.hot = hot;
		this.latest = latest;
		this.big = big;
		this.trending = trending;
		this.sale = sale;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isDiscount = isDiscount;
		this.discountDate = discountDate;
		this.wholeSellQty = wholeSellQty;
		this.wholeSellDiscount = wholeSellDiscount;
		this.isCatalog = isCatalog;
		this.catalogId = catalogId;
	}

	public Product() {
		// Constructor logic
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAffiliateLink() {
		return affiliateLink;
	}

	public void setAffiliateLink(String affiliateLink) {
		this.affiliateLink = affiliateLink;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public int getChildcategoryId() {
		return childcategoryId;
	}

	public void setChildcategoryId(int childcategoryId) {
		this.childcategoryId = childcategoryId;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeQty() {
		return sizeQty;
	}

	public void setSizeQty(String sizeQty) {
		this.sizeQty = sizeQty;
	}

	public String getSizePrice() {
		return sizePrice;
	}

	public void setSizePrice(String sizePrice) {
		this.sizePrice = sizePrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getPreviousPrice() {
		return previousPrice;
	}

	public void setPreviousPrice(Double previousPrice) {
		this.previousPrice = previousPrice;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(int productCondition) {
		this.productCondition = productCondition;
	}

	public String getShip() {
		return ship;
	}

	public void setShip(String ship) {
		this.ship = ship;
	}

	public boolean getIsMeta() {
		return isMeta;
	}

	public void setIsMeta(boolean isMeta) {
		this.isMeta = isMeta;
	}

	public String getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(String metaTag) {
		this.metaTag = metaTag;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getLicenseQty() {
		return licenseQty;
	}

	public void setLicenseQty(String licenseQty) {
		this.licenseQty = licenseQty;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLicenceType() {
		return licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public boolean getFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	public boolean getBest() {
		return best;
	}

	public void setBest(boolean best) {
		this.best = best;
	}

	public boolean getTop() {
		return top;
	}

	public void setTop(boolean top) {
		this.top = top;
	}

	public boolean getHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

	public boolean getLatest() {
		return latest;
	}

	public void setLatest(boolean latest) {
		this.latest = latest;
	}

	public boolean getBig() {
		return big;
	}

	public void setBig(boolean big) {
		this.big = big;
	}

	public boolean getTrending() {
		return trending;
	}

	public void setTrending(boolean trending) {
		this.trending = trending;
	}

	public boolean getSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
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

	public boolean getIsDiscount() {
		return isDiscount;
	}

	public void setIsDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	public String getDiscountDate() {
		return discountDate;
	}

	public void setDiscountDate(String discountDate) {
		this.discountDate = discountDate;
	}

	public String getWholeSellQty() {
		return wholeSellQty;
	}

	public void setWholeSellQty(String wholeSellQty) {
		this.wholeSellQty = wholeSellQty;
	}

	public String getWholeSellDiscount() {
		return wholeSellDiscount;
	}

	public void setWholeSellDiscount(String wholeSellDiscount) {
		this.wholeSellDiscount = wholeSellDiscount;
	}

	public boolean getIsCatalog() {
		return isCatalog;
	}

	public void setIsCatalog(boolean isCatalog) {
		this.isCatalog = isCatalog;
	}

	public int getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}

}