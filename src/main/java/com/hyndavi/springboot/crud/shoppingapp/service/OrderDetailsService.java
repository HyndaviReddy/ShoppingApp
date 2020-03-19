package com.hyndavi.springboot.crud.shoppingapp.service;

import java.util.List;

import com.hyndavi.springboot.crud.shoppingapp.model.OrderDetails;


public interface OrderDetailsService {
	
public List<OrderDetails> findAll();
	
	public OrderDetails findById(int theId);
	
	public void save(OrderDetails theOrderDetails);
	
	public void deleteById(int theId);

}
