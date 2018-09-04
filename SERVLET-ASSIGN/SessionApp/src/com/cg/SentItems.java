package com.cg;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SentItems")
public class SentItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			response.getWriter().print("<!DOCTYPE html><html><head><title>Sent Items</title></head><body>"
					+ "<div style='color:green'>"
					+ "Welcome<b>"+session.getAttribute("username")+"</b>!!<br/>"
					+ "Login time :"+LocalDateTime.now()+"<br/></div>"
					+ "<div><form action='Inbox' method='post'>"
					+ "<input type='submit' value='Inbox'> "
					+ "</form></div>"
					+ "<div><form action='Logout' method='post'>"
					+ "<hr><input type='submit' value='Sign out'></hr> </form></div></body></html>");
		}else
		{
			response.getWriter().print("<hr>First Login then u get internall pages<hr/></b>");
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}
	}

}
