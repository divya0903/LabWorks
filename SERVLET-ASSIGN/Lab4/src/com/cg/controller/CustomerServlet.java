package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Customers;

import com.cg.service.CustomerServiceImpl;

import com.cg.service.ICustomerService;


@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICustomerService service=new CustomerServiceImpl();
		ArrayList<Customers> list=service.getAllCustomers();
		request.setAttribute("cust", list);
		request.getRequestDispatcher("/output.jsp").include(request, response);
	}

}
