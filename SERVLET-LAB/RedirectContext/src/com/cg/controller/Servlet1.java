package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlet1() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("In servlet 1");
		
		Integer num=Integer.parseInt(request.getParameter("num"));
		System.out.println("In servlet 1 num1 is :" +num);
		Integer newNum=num+5;
		
		getServletContext().setAttribute("val", newNum);
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/Servlet2");
		dispatcher.include(request, response);
		Integer result=(Integer) getServletContext().getAttribute("result1");
		
		System.out.println("Out of servlet 1, about to send response");
		
		response.getWriter().print("<html><body><center><h4>"
				+ "This is response from servlet1 <br/>"
				+ "The result is :"+result+ "</h4></center></body></html>");
	}

}
