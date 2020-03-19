package com.hyndavi.springboot.crud.shoppingapp.service;

import java.util.List;

import com.hyndavi.springboot.crud.shoppingapp.model.Customer;


public interface CustomerService {

	
public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
}
