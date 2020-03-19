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
	private int prod_id;
	
	@Column(name="prod_name")
	private String prodName;
	
	@Column(name="prod_price")
	private int prodPrice;
	
	public Product() {
		
	}

	public Product(int prod_id, String prdName) {
		this.prod_id = prod_id;
		this.prodName = prdName;
	}
	
	


	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getPrdName() {
		return prodName;
	}


	public void setPrdName(String prdName) {
		this.prodName = prdName;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}

	

	

	
}
