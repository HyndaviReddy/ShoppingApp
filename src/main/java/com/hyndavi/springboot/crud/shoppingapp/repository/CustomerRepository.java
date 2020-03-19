package com.hyndavi.springboot.crud.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyndavi.springboot.crud.shoppingapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
