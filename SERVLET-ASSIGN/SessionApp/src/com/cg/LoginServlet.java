package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("uname").trim().equals("divya")
				&& request.getParameter("pwd").trim().equals("divya"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", request.getParameter("uname"));
			request.getRequestDispatcher("Inbox").forward(request, response);
		}else
		{
			response.getWriter().print("<hr>Enter correct user name and password </hr>");
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}
	}

}
