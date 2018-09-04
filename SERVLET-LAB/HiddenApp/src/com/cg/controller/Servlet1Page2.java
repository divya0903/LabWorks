package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1Page2")
public class Servlet1Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1Page2() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String firstname=request.getParameter("fname");
		 String lastname=request.getParameter("lname");
		 String mobile=request.getParameter("mobile");
		
		 response.getWriter().print("<!DOCTYPE html><html><head><title>Page 2</title></head>"
		 		+ "<body><form action='Servlet2Page3' method='post'>"
				+"<input type='hidden' name='fname' value='"+firstname+"'/>"
				+"<input type='hidden' name='lname' value='"+lastname+"'/>"
				+"<input type='hidden' name='mobile' value='"+mobile+"'/>"
				+"Email<input type='email' name='email'/><br/>"
				+"Gender<input type='text' name='gender'/><br/>"
				+"<input type='submit' value='continue'/>"
		 		+ "</form></body></html>");
	}

}
