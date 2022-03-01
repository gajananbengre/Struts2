package com.gaja.controllers.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.gaja.entities.Product;
import com.gaja.services.ProductService;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/product")
@Results({
	@Result(name = "success", location = "/WEB-INF/views/product/index.jsp")
})
public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ProductService productService;

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Action(value = "index")
	public String index() {
		this.products = this.productService.findAll();
		return SUCCESS;
	}

}