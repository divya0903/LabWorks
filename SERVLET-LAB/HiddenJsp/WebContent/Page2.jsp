<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 2</title>
</head>
<body>
		<%
			String firstname=request.getParameter("fname");
			String lastname=request.getParameter("lname");
			String mobile=request.getParameter("mobile");
 		%>
 	<form action="Page3.jsp">	
 	
 				<input type='hidden' name='fname' value='<%=firstname %>'/>
				<input type='hidden' name='lname' value='<%=lastname %>'/>
				<input type='hidden' name='mobile' value='<%=mobile %>'/>
				Email<input type='text' name='email'/><br/>
				Gender<input type='text' name='gender'/><br/>
				<input type='submit' value='continue'/>
 		
 	</form>
</body>
</html>