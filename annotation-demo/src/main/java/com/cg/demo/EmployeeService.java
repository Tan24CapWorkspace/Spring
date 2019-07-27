package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class EmployeeService {
		
	private EmployeeDAO dao;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeService(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	public EmployeeDAO getDao() {
		return dao;
	}
	
	@Autowired
	public void setDao(EmployeeDAO dao) {
		System.out.println("Performing setter injection");
		this.dao = dao;
	}
	
	
}
