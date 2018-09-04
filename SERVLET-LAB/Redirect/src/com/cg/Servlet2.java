package com.cg;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi from servlet 2");
	
		
		String str=(String) request.getParameter("a");
		System.out.println(str);
		System.out.println("bye from servlet 2");
		response.getWriter().print("<html><body><center><h4>"
				+ "this is response from servlet2 "
				+ "String is :"+str+" <br/> </h4></center></body></html>");
	}

}
