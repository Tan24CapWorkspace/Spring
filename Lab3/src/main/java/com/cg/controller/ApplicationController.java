package com.cg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.ProductDAOImpl;
import com.cg.entities.Product;

@RestController
@RequestMapping("/rest")
public class ApplicationController {
	
	ProductDAOImpl dao = new ProductDAOImpl();
	
	@PostMapping("/add")
	public String addProduct(Product product) {
		if(dao.add(product)) {
			return "Product added";
		}else {
			return "Product not added";
		}
	}
	
	@GetMapping(value="/products",produces={"application/json","application/xml","text/html"})
	public List<Product> getAll(){
		return dao.getAll();
	}
}
