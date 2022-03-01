package com.gaja.repositories;

import java.util.List;

import com.gaja.entities.Product;


public interface ProductRepository {

	public List<Product> findAll();

}