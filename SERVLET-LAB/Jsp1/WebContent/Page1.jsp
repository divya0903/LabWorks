<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="background-color: lightblue">
		Hello from page 1 <br /> Going to page 2
	</div>
	<div>
		<jsp:include page="Page2.jsp" flush="true">
			<jsp:param value="divya" name="bow" />
		</jsp:include>
		<hr />
	</div>
	<div style="background-color: lightblue">
		Again from page 1
	</div>
</body>
</html>