package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.demo.EmployeeDAO;
import com.cg.demo.EmployeeService;

// this is replacement of spring.xml
@Configuration
public class AppConfig {
	
	@Bean // Define a bean
	// syntax : public <ClassName> <BeanID>{}
	public EmployeeDAO dao(){
		return new EmployeeDAO();
	}
	
	@Bean
	public EmployeeService service(){
		EmployeeService service = new EmployeeService();
		service.setDao(dao()); // setter injection with java syntax
		return service;
	}
	
}
