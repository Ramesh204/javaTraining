<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*,com.training.servlet.itemList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String bgcolor; %>


<%
	Cookie[] ckys = request.getCookies();
	
	List<Cookie> list = Arrays.asList(ckys);
	
	
	List<String> ckyName = list.stream().filter(cky->cky.getName().equals("srchitem")).map(cky->cky.getValue()).collect(Collectors.toList());
	
	
	List<String> items = itemList.getItems().get(ckyName.get(0));
	
	for(String s:items){
		out.println("<h2>"+s +"</h2>");
	}
%>
<ul>
	<li>Electronics</li>
	<li>Textiles</li>
	<li>Books</li>
	<li>Fashion</li>
</ul>


</body>
</html>