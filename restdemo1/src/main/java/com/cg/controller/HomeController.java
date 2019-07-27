package com.cg.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Message;

@RestController
@RequestMapping("/test")
public class HomeController {
	/**
	 * Process GET REQUEST on localhost:5000/test/
	 * @return JSON or XML object of type MESSAGE
	 * */
	@GetMapping(value = "/", produces= {"application/json","application/xml"})
	public Message testGet() {
		return new Message("This is Get Request");
	}
	
	/**
	 * Process POST REQUEST on localhost:5000/test/
	 * @return JSON or XML object of type MESSAGE
	 * */
	@PostMapping(value = "/", produces= {"application/json","application/xml"})
	public Message testPost() {
		return new Message("This is POST method");
	}
	
	/**
	 * Process PUT REQUEST on localhost:5000/test/
	 * @return JSON or XML object of type MESSAGE
	 * */
	@PutMapping(value = "/", produces= {"application/json","application/xml"})
	public Message testPut() {
		return new Message("This is PUT request");
	}
	
	/**
	 * Process DELETE REQUEST on localhost:5000/test/
	 * @return JSON or XML object of type MESSAGE
	 * */
	@DeleteMapping(value = "/", produces= {"application/json","application/xml"})
	public Message testDelete() {
		return new Message("This is DELETE request");
	}
}
