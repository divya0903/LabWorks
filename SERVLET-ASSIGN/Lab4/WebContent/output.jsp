<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer address</th>
		</tr>
		<c:forEach items="${cust}" var="e">
		<tr>
			<td><c:out value="${e.id}"></c:out></td>
			<td><c:out value="${e.name}"></c:out></td>
			<td><c:out value="${e.address}"></c:out></td>
		</tr> 
		</c:forEach>
	</table>
	
</body>
</html>