<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<h1>${command.name}</h1>
<img src="resources/images/${command.imageName}.jpg">
<p>${command.description}</p>
<p>${command.continent}</p>
<p>${command.type}</p>

</body>
</html>