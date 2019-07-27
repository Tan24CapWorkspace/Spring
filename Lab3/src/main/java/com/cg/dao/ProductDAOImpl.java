package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entities.Product;

@Repository
public class ProductDAOImpl {
	
	List<Product> list = new ArrayList<Product>();
	
	public boolean add(Product product) {
		return list.add(product);
	}
	
	public List<Product> getAll(){
		return list;
	}
}
