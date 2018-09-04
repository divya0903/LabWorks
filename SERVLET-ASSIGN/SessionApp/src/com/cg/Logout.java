package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			session.setAttribute("username", null);
			session.invalidate();
			response.getWriter().print("<hr><b>Logged out successfully !!</b></hr>");
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}else
		{
			response.getWriter().print("<hr><b>First Login then u get internall pages</b></hr>");
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}
	}

}
