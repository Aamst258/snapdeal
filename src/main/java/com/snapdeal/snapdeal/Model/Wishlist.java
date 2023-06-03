package com.snapdeal.snapdeal.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishlist")
public class Wishlist {
	
	@Id
	private String id;
	private String productName;
	private String productCategory;
private String image;
private double price;
private String productId;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
@Override
public String toString() {
	return "Wishlist [id=" + id + ", productName=" + productName + ", productCategory=" + productCategory + ", image="
			+ image + ", price=" + price + ", productId=" + productId + "]";
}
public Wishlist(String id, String productName, String productCategory, String image, double price, String productId) {
	super();
	this.id = id;
	this.productName = productName;
	this.productCategory = productCategory;
	this.image = image;
	this.price = price;
	this.productId = productId;
}
public Wishlist() {
	super();
	// TODO Auto-generated constructor stub
}

}
