package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet2() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("In servlet 2");
		
		Integer valfromServlet1=(Integer) getServletContext().getAttribute("val");
		Integer result=valfromServlet1*valfromServlet1;
		getServletContext().setAttribute("result1", result);
		
		System.out.println("Out of servlet 2");
		response.getWriter().print("<html><body><center><h4>"
				+ "This is response from servlet2 in include method <br/> </h4></center></body></html>");
	}

}
