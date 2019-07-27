package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO dao = context.getBean(EmployeeDAO.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		System.out.println("Dao "+dao);
		System.out.println("Service "+service);
	}
}
