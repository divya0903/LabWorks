<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<%
		String firstname=request.getParameter("fname");
	 	String lastname=request.getParameter("lname");
	 	String mobile=request.getParameter("mobile");
	 	String email=request.getParameter("email");
	 	String gender=request.getParameter("gender");
	 	String country=request.getParameter("country");
	 	String state=request.getParameter("state");
	%>
	<center>
		<h3>
			First Name :<%=firstname %><br/>
			Last Name :<%=lastname %><br/>
			Mobile :<%=mobile %><br/>
			E-mail :<%=email %><br/>	
			Gender :<%=gender %><br/>	
			Country :<%=country %><br/>
			State : <%=state %><br/>
		</h3>
	</center>
			
					
</body>
</html>