package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Employee;
import com.cg.service.EmployeeServiceImpl;
import com.cg.service.IEmployeeService;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		IEmployeeService service=new EmployeeServiceImpl();
		ArrayList<Employee> list=service.getAllEmployee();
		
		request.setAttribute("emp", list);
		request.getRequestDispatcher("/output.jsp").include(request, response);
		
	}

}
