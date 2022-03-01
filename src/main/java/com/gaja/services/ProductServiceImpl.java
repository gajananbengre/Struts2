package com.gaja.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaja.entities.Product;
import com.gaja.repositories.ProductRepository;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;


	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

}