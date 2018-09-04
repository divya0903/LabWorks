<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
	<%@include file="directiveTag.jsp" %>
	<h4>hello....</h4><br/>
	<%=
		LocalDate.now()    //to print 
	%> <br/>
	<%!
		int count=0;    //declaration
	%>
	<%
		count++;
	%>
	<strong style="color:red">Page is visited <%= count%> times !</strong>
	<div><%@include file="directiveTag.jsp" %></div>
</body>
</html>