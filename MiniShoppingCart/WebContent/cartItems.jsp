<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Selected Items</h2>
<%
	Map<String,String[]> itemSelected =(Map<String,String[]>) session.getAttribute("cart");
	
	Set<String> itemCategory = itemSelected.keySet(); 
	
	for(String item:itemCategory){%>
	<b><br/>	<%out.println(item); %>: </b>
		
<%		
		
		for(String key:itemSelected.get(item)){
		out.println(key);
	} 
	}
%>
</body>
</html>