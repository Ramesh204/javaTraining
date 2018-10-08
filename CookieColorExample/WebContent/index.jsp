<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Color Change</title>
</head>
<body style="background-color:<%=bgColor %>" >
<%! String bgColor; %>

<%
	Cookie[] ckys = request.getCookies();
	List<Cookie> ckyList = Arrays.asList(ckys);	
	List<String> ckyName  = ckyList.stream().filter(cky->cky.getName().equals("bgColor")).map(cky->cky.getValue()).collect(Collectors.toList());
	
	if(ckyName.size()>0)
	{
		bgColor = ckyName.get(0);
		
	}
	else
	{
		bgColor = "#ffffff";
	}
	
	out.println(bgColor);
%>

<form action="Color.jsp">
<lable for="color picker">Select Color</lable>
<input type="color"  name="bgColor"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>