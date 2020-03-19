package com.hyndavi.springboot.crud.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hyndavi.springboot.crud.shoppingapp.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
