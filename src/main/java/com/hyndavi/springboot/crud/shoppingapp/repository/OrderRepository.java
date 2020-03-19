package com.hyndavi.springboot.crud.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyndavi.springboot.crud.shoppingapp.model.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{

}
