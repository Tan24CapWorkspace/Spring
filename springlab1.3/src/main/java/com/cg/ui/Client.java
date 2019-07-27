package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SBU sbu = (SBU) context.getBean("sbu",SBU.class);
		System.out.println("SBU details\n-------------------------");
		System.out.println(sbu.toString());
	}
}
