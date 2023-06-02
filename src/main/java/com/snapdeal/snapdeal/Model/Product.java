/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snapdeal.snapdeal.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author HP
 */

@Document(collection = "Product")
public class Product {
	
	@Id
	private String pid;
	private String productName;
	
	private String description;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", description="
				+ description + ", categoryName=" + categoryName + ", price=" + price + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pid, String productName, String categoryName, double price,String image,String description) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
		
		this.description = description;
	}
	
	private String categoryName;
	private double price;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}
