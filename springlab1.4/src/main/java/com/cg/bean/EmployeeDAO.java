package com.cg.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class EmployeeDAO {
	private List<Employee> list = new ArrayList<Employee>();

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	public Employee findEmp(String id){
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Employee emp = (Employee) iterator.next();
			if(String.valueOf(emp.getEmployeeId()).equals(id)){
				return emp;
			}
		}
		return null;
	}
}
