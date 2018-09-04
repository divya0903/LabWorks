package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet("/cookie")
public class cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public cookie() {
        super();
       
    }	
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
    {
    	doPost(request, response);
    }*/
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		Cookie cook1=new Cookie("divya", "capgemini  adghabdaish");
		response.addCookie(cook1);
		cook1.setMaxAge(600);
		//cook1.setDomain("FS");
		cook1.setVersion(3);
		
		Cookie cook2=new Cookie("preethi", "Hcl ahdaksbndkiwdun");
		response.addCookie(cook2);
		cook2.setMaxAge(3600);
		//cook2.setDomain("BI");
		cook2.setVersion(2);
		
	
		
	}

}
