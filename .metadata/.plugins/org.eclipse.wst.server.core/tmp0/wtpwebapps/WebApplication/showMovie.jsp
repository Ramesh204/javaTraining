<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>


<body>
<h2 style="test-allign:center">Movie List</h2>

<table border=1 class="table table-striped">
	<tr>
		<th>MovieId</th>
		<th>MovieName</th>
		<th>Director</th>
		<th>Genre</th>
		<th>Rating</th>
	</tr>



<%
List<Movie> movieList = (List<Movie>)request.getAttribute("movieList");

for(Movie eachMovie:movieList){
%>

<tr>
	<td><% out.println(eachMovie.getMovieId()); %></td>
	<td><% out.println(eachMovie.getMovieName()); %></td>
	<td><% out.println(eachMovie.getDirector()); %></td>
	<td><% out.println(eachMovie.getGenre()); %></td>
	<td><% out.println(eachMovie.getRating()); %></td>
</tr>


<%
}

%>
</table>

</body>
</html>