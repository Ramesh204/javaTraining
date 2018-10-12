<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta charset="ISO-8859-1">
<title>Success</title>

<link href="resources/css/Style.css" rel="stylesheet" type="text/css"/>
</head>
<body>


<!--  <h1>${bookAdded}</h1> -->


<table>
	<tr>
		<th>BookNumber</th>
		<th>BookName</th>
		<th>Author</th>
		<th>Category</th>
		<th>DateOfPublish</th>
		<th>RatePerUnit</th>
	</tr>
	<tr>
		<td> <c:out value="${command.bookNumber}" > </c:out> </td>
		<td> <c:out value="${command.bookName}" > </c:out> </td>
		<td> <c:out value="${command.author}" > </c:out> </td>
		<td> <c:out value="${command.category}" > </c:out> </td>
		<td> <c:out value="${command.dateOfPublish}" ></c:out>  </td>
		<td> <c:out value="${command.ratePerUnit}" > </c:out> </td>
	</tr>
</table> 
</body>
</html>