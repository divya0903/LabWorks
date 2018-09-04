<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display page</title>
</head>
<body style="background-color:gray;">
	<%
		String uname = request.getParameter("user");
		String pswd = request.getParameter("psw");
		
		if(uname.equals("divya") && pswd.equals("divya"))
		{%>

	<center><h1>Successful Login</h1></center>

	<% }else
		{%>
	<center><h1>Failure</h1></center>
	
	<%} %>


</body>
</html>