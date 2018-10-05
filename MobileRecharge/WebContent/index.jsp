<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Sun NetWork</title>
</head>
<body>
<%! Long phoneNumber; String planName; %>
<%
	Cookie[] ckys = request.getCookies();
	List<Cookie> ckyList = Arrays.asList(ckys);
	
	List<String> ckyName = ckyList.stream().filter(cky->cky.getName().equals("phoneNumber")).map(cky->cky.getValue()).collect(Collectors.toList());
	
	if(ckyName.size()>0){
		phoneNumber = Long.parseLong( ckyName.get(0));
	}
	out.println(phoneNumber);
	
	 ckyName = ckyList.stream().filter(cky->cky.getName().equals("plan")).map(cky->cky.getValue()).collect(Collectors.toList());
	if(ckyName.size()>0){
		planName = ckyName.get(0);
	}
	out.println(planName);
%>
<%@include file="planList.html" %>

	<div id="A2">
	<form action="Success.jsp">
	<input type="number" name="phoneNumber" id="phoneNumber" placeholder="Enter 10 digit phoneNumber" required="required"  /><br/>
	<select name="plan" id="plan">
		<option value="plan1">Plan1</option>
		<option value="plan2">Plan2</option>
		<option value="plan3">Plan3</option>
	</select> <br/>
	
	
	<input type="submit" value="Recharge"/>
	</form>
	
	</div>
</body>
</html>