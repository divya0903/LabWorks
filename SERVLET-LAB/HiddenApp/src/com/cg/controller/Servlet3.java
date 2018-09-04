package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet3() {
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
		 String country=request.getParameter("country");
		 String state=request.getParameter("state");
		 
		 response.getWriter().print("<!DOCTYPE html><html><head><title>Servlet 3</title></head>"
			 		+ "<body>"
					+"Fname :"+firstname+"<br/>"
					+"Lname :"+lastname+"<br/>"
					+"Mobile :"+mobile+"<br/>"
					+"E-mail :"+email+"<br/>"	
					+"Gender :"+gender+"<br/>"	
					+"Country :"+country+"<br/>"
					+"State : "+state+"<br/>"
					+ "</body></html>");
		 System.out.println(firstname+" "+lastname+" "+mobile+" "+email+" "+gender+" "+country+" "+state);
		
	}

}
