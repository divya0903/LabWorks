package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(101, "divya", 45215.00));
		list.add(new Employee(102, "jeevana", 35215.00));
		list.add(new Employee(103, "preethi", 52515));
		return list;
	}

}
