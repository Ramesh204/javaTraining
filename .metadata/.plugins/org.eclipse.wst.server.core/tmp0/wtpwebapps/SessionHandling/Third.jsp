<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	out.println(session.isNew());
	out.println(session.getId());
	
	out.println(session.getAttribute("firstAttr"));
	out.println(session.getAttribute("secondAttr"));
%>

<%
	session.invalidate();

	
%>

<a href="Fourth.jsp">Next</a>
</body>
</html>