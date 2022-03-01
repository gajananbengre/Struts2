package com.gaja.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.gaja.entities.Product;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		try {
			return entityManager.createQuery("from Product").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}