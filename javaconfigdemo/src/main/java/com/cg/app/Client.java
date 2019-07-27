package com.cg.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.demo.EmployeeDAO;
import com.cg.demo.EmployeeService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // only use applicationcontext
		EmployeeDAO dao = context.getBean("dao", EmployeeDAO.class);
		EmployeeDAO dao1 = context.getBean(EmployeeDAO.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		System.out.println("dao : "+dao);
		System.out.println("dao : "+dao1);
		System.out.println("service : "+service.getDao());
	}
}
