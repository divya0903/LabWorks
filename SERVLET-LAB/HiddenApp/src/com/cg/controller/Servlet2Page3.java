package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2Page3")
public class Servlet2Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet2Page3() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String firstname=request.getParameter("fname");
		 String lastname=request.getParameter("lname");
		 String mobile=request.getParameter("mobile");
		 String email=request.getParameter("email");
		 String gender=request.getParameter("gender");
	
		 response.getWriter().print("<!DOCTYPE html><html><head><title>Page 3</title></head>"
			 		+ "<body><form action='Servlet3' method='post'>"
					+"<input type='hidden' name='fname' value='"+firstname+"'/>"
					+"<input type='hidden' name='lname' value='"+lastname+"'/>"
					+"<input type='hidden' name='mobile' value='"+mobile+"'/>"
					+"<input type='hidden' name='email' value='"+email+"'/>"	
					+"<input type='hidden' name='gender' value='"+gender+"'/>"	
					+"Country<input type='text' name='country'/><br/>"
					+"State<input type='text' name='state'/><br/>"
					+"<input type='submit' value='submit'/>"
					+ "</form></body></html>");
	}

}
