package com.snapdeal.snapdeal.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cart")
public class Cart { 
	private String productName;
	private String productCategory;
	private double qauntity ;
	private double price;
	private  String userName;
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
	public double getQauntity() {
		return qauntity;
	}
	public void setQauntity(double qauntity) {
		this.qauntity = qauntity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Cart(String productName, String productCategory, double qauntity, double price, String userName) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.qauntity = qauntity;
		this.price = price;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Cart [productName=" + productName + ", productCategory=" + productCategory + ", qauntity=" + qauntity
				+ ", price=" + price + ", userName=" + userName + "]";
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}  
	

}
