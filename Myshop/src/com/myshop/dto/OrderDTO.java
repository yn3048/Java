package com.myshop.dto;

import java.util.Set;

public class OrderDTO {

	private int orderNo;
	private String orderId;
	private int orderProduct;
	
	
	//추가필드
	private String prodName;
	private int price;
	private String company;
	

	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNO) {
		this.orderNo = orderNO;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	private int orderCount;
	private String orderDate;


	@Override
	public String toString() {
		return "OrderDTO [orderNo=" + orderNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct
				+ ", orderCount=" + orderCount + ", orderDate=" + orderDate + "]";
	
}
	
}
