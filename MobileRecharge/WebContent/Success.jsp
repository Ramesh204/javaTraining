<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sun NetWork</title>
</head>
<body>
<%
	Cookie cky1 = new Cookie("phoneNumber",request.getParameter("phoneNumber"));
	Cookie cky2 = new Cookie("plan",request.getParameter("plan"));
	
	response.addCookie(cky1);
	response.addCookie(cky2);
%>
<h1>Recharge Successful</h1>

<a href="index.jsp">Go To Home</a>
</body>
</html>