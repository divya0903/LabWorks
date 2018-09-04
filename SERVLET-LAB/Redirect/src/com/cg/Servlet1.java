 package com.cg;

import java.io.IOException;

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
System.out.println("in servlet 1");
		
		
		String firstName=request.getParameter("data");
		System.out.println("in servlet 1 firstname is :" +firstName);
		String newString=firstName+" gurumanchi";
		
		response.sendRedirect("Servlet2?a="+newString);
		
		System.out.println("out of servlet 1, about to send response");
		
		response.getWriter().print("<html><body><center><h4>"
				+ "hi this is response from servlet1 <br/>"
				+ "the result is :"+newString+ "</h4></center></body></html>");
	}

}
