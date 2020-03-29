package com.hyndavi.springboot.crud.shoppingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order1")
public class Order {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cust_id;
	
	@Id
	@Column(name="order_id")
	
	private int orderId;
	@Column(name="prod_id")
	private int prodId;
	
	
	public Order() {
	
	}
	public Order(int cust_id, int orderId, int prodId) {
	
		this.cust_id = cust_id;
		this.orderId = orderId;
		this.prodId = prodId;
	}
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
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
	
	@Override
	public String toString() {
		return "Order [cust_id=" + cust_id + ", orderId=" + orderId + ", prodId=" + prodId + "]";
	}
	
	
	
	

}
