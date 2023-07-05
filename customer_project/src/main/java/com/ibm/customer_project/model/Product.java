package com.ibm.customer_project.model;

import java.io.Serializable;

public class Product implements Serializable{
	
	private String productName;
	private double productPrice;
	private int productId;
	public Product() {
		super();
	}
	public Product(String productName, double productPrice, int productId) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productId=" + productId
				+ "]";
	}
	
	

}