package com.hyndavi.springboot.crud.shoppingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="prod_name")
	private String prodName;
	
	public Product() {
		
	}

	public Product(int id, String prdName) {
		this.id = id;
		this.prodName = prdName;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrdName() {
		return prodName;
	}


	public void setPrdName(String prdName) {
		this.prodName = prdName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prdName=" + prodName + "]";
	}


	

	
}
