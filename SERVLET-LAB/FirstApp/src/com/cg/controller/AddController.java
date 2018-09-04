package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.service.AddServiceImpl;
import com.cg.service.IAddService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("AddController")
public class AddController extends HttpServlet {
	IAddService service= new AddServiceImpl();
	private static final long serialVersionUID = 1L;
       
   
    public AddController() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		Integer num1=Integer.parseInt(request.getParameter("num1"));
		Integer num2=Integer.parseInt(request.getParameter("num2"));
		
		int result=service.addNumbers(num1, num2);
		System.out.println(result);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><head>"
				+ "<title>Addition of Numbers</title>"
				+ "</head><body>Addition of "+num1+" and "+num2+" is : "+result+"</body></html>");
	}

}
