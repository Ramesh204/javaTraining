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
	session.setAttribute("jspPage", 3);
%>

<form action="cart">
	<input type="checkbox" name="coupnSelected" value="100Coupon"/>100Coupon<br/>
	<input type="checkbox"  name="coupnSelected" value="500Coupon"/>500coupon<br/>
	<input type="checkbox"  name="coupnSelected" value="1000Coupon"/>1000Coupon<br/>
	
	<input type="submit" value="AddToCart"/>
	
</form>

</body>
</html>