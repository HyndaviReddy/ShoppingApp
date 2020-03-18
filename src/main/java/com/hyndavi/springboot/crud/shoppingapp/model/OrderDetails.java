package com.hyndavi.springboot.crud.shoppingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@Id
	private int prodId;
	@Column(name="price")
	private int price;
	@Column(name="quantity")
	private int quantity;
	public OrderDetails() {
		
	}
	public OrderDetails(int orderId, int prodId, int price, int quantity) {
	
		this.orderId = orderId;
		this.prodId = prodId;
		this.price = price;
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", prodId=" + prodId + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
	

}
