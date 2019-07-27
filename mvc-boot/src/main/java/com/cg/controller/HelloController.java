package com.cg.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.*;


@RestController
public class HelloController {
	@GetMapping("/")  // Home page
	public String hello() {
		return "Hello World";
	}
	
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		List<Product> list = new LinkedList<Product>();
		list.add(new Product(101,"Windows", "64 bit os for desktop and laptops",8000D));
		list.add(new Product(102,"Ubuntu", "18.04 bit os for desktop and laptops",0D));
		list.add(new Product(103,"Linux", "64 bit os for desktop and laptops",0D));
		return list;
	}
}
