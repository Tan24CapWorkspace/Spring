package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.demo.EmployeeDAO;
import com.cg.demo.EmployeeService;

// this is replacement of spring.xml
@Configuration
@ComponentScan("com.cg.demo")
public class AppConfig {
	
}
