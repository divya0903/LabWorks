package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Customers;


public class CustomerServiceImpl implements ICustomerService {

	@Override
	public ArrayList<Customers> getAllCustomers() {
		ArrayList<Customers> list= new ArrayList<Customers>();
		list.add(new Customers(101, "divya", "Hyderabad"));
		list.add(new Customers(102, "jeevana", "Banglore"));
		list.add(new Customers(103, "preethi", "Mumbai"));
		return list;
		
	}

}
