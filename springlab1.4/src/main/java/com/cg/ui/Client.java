package com.cg.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.EmployeeDAO;

public class Client {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			EmployeeDAO dao = context.getBean("dao", EmployeeDAO.class);
			System.out.println("Enter the Employee ID : ");
			String id = br.readLine();
			System.out.println(dao.findEmp(id).toString());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
