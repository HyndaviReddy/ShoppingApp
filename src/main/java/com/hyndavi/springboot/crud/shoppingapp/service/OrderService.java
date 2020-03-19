package com.hyndavi.springboot.crud.shoppingapp.service;

import java.util.List;

import com.hyndavi.springboot.crud.shoppingapp.model.Order;

public interface OrderService {

	
public List<Order> findAll();
	
	public Order findById(int theId);
	
	public void save(Order theOrder);
	
	public void deleteById(int theId);
}
