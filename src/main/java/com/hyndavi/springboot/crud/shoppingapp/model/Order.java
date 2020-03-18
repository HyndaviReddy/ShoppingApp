package com.hyndavi.springboot.crud.shoppingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="order_id")
	private int orderId;
	@Column(name="prod_id")
	private int prodId;
	
	
	public Order() {
	
	}
	public Order(int id, int orderId, int prodId) {
	
		this.id = id;
		this.orderId = orderId;
		this.prodId = prodId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Order [id=" + id + ", orderId=" + orderId + ", prodId=" + prodId + "]";
	}
	
	

}
