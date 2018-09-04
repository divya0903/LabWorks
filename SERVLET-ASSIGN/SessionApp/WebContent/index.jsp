<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="LoginServlet" method="post">
	<center>
	User Name<input type="text" name="uname"/>
	<br><br/>
	Password<input type="password" name="pwd"/>
	<br><br/>
	<input type="submit" value="login"/>
	</center>
	</form>
	
</body>
</html>