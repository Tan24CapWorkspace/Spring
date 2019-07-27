package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}

	@Autowired             // dependency injection using the set function not at the constructor calling time
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	
}
