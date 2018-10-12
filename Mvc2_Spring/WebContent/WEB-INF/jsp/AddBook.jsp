<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>

<div class="form-group col-sm-4">
<form:form action="addBook" method="post"  >

	<label for="bookNumber">BookNumber</label>
	<form:input path="bookNumber" class="form-control" />
	<span><form:errors cssStyle="color:red" path="bookNumber"></form:errors></span> <br/>
	
	<label for="bookName">BookName</label>
	<form:input path="bookName" class="form-control" /> <br/>
	
	<label for="author">Author</label>
	<form:input path="author" class="form-control" /> <br/>
	
	<label for="category">Category</label>
	<form:select items="${catList}" path="category" class="form-control" /> <br/>
	
	<label for="dateOfPublish">DateOfPublish</label>
	<form:input type="date" path="dateOfPublish" class="form-control" />
	<span><form:errors cssStyle="color:red" path="dateOfPublish"></form:errors></span> <br/>
	
	
	<label for="ratePerUnit">RatePerUnit</label>
	<form:input path="ratePerUnit" class="form-control" /> <br/>
	
	<input type="submit" value="submit" class="btn btn-success"/>
	
</form:form>

</div>
</body>
</html>