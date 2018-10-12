<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<meta charset="ISO-8859-1">
<title>Add Wonder</title>
</head>
<body>
<form:form action="addWonder" method="post">

	<label for="name">MonumentName</label>
	<form:input path="name" />
	
	<label for="imageName">ImageRef</label>
	<form:input path="imageName" />
	
	<label for="description">Description</label>
	<form:input path="description" />
	
	<label for="continent">Continent</label>
	<form:select items="${continentList}" path="continent" />
	
	
	Modern<form:radiobutton value="Modern" path="type" />
	Ancient<form:radiobutton value="Ancient" path="type" />
	
	
	<input type="submit" value="submit" />
	
</form:form>

</body>
</html>