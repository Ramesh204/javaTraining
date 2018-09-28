<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addmovie" method="post">
	<label for="movieId">MovieId</label>
	<input type="text" placeholder="Enter MovieId" name="movieId"/>
	<label for="movieName">MovieName</label>
	<input type="text" placeholder="Enter MovieName" name="movieName"/>
	<label for="director">Director</label>
	<input type="text" placeholder="Enter Director Name" name="director" />
	<label for="genre">Genre</label>
	<input type="text" placeholder="Enter Genre" name="genre" />
	<label for="rating">Rating</label>
	<input type="text" placeholder="Enter Rating" name="rating"/>
	
	<input type="submit" value="addMovie" />
</form>
</body>
</html>