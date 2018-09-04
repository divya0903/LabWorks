package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Lab2")
public class Lab2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    			
		String uname=request.getParameter("user");
		String pswd=request.getParameter("psw");
		
		String name="divya";
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("SuccessServlet");
		if(uname.equals(name) && pswd.equals(name))
		{
					
			dispatcher.include(request, response);
			
		}else
		{
			response.getWriter().print("<html><head>"
					+ "</head><body><center>Failure<center/></body></html>");
		}
    }



}
