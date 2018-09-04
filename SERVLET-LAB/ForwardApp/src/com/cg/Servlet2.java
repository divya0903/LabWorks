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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("hi from servlet 2");
		
		String valfromServlet1=(String) request.getAttribute("val");
		String result=valfromServlet1.toUpperCase();
		request.setAttribute("result", result);
		
		System.out.println("bye from servlet 2");
		response.getWriter().print("<html><body><center><h4>"
				+ "this is response from servlet2 in forward method string is converted "
				+ "from lower case to upper case <br/> </h4></center></body></html>");
	}

}
