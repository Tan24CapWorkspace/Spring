package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) context.getBean("emp", Employee.class);
		
		System.out.println("Employee details\n-----------------------------");
		System.out.println("Employee ID : "+emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Employee BU : "+emp.getBusinessUnit());
		System.out.println("Employee Age : "+emp.getAge());
	}
}
