package com.hyndavi.springboot.crud.shoppingapp.service;

import java.util.List;

import com.hyndavi.springboot.crud.shoppingapp.model.Product;

public interface ProductService {

	
public List<Product> findAll();
	
	public Product findById(int theId);
	
	public void save(Product theProduct);
	
	public void deleteById(int theId);
}
