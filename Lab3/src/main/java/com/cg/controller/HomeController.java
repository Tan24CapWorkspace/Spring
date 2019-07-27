package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entities.Product;

@Controller
public class HomeController {
	
	ApplicationController app = new ApplicationController();
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("products",app.getAll());
		return mv;
	}
	
	@GetMapping("/addpage")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("post");
		return mv;
	}
	
	@PostMapping("/addnew")
	public ModelAndView addnew(@RequestParam Integer id, @RequestParam String name, @RequestParam Double price) {
		ModelAndView mv = new ModelAndView("view");
		app.addProduct(new Product(id, name, price));
		mv.addObject("products",app.getAll());
		return mv;
	}
}
