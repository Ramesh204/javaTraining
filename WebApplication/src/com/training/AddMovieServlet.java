package com.training;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.DAO;
import com.training.entity.Movie;
import com.training.entity.MovieDAIimpl;
import com.training.utils.DbConnections;

/**
 * Servlet implementation class AddMovieServlet
 */
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		ClassLoader clsLoader = Thread.currentThread().getContextClassLoader();
		
		InputStream stream = clsLoader.getResourceAsStream("jdbc.properties");
		
		Connection conn = DbConnections.getOracleConnection(stream);
		
		DAO<Movie> dao = new MovieDAIimpl(conn);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/movie");
		
		Movie movie = new Movie();
		
		 movie.setMovieId(Long.parseLong(request.getParameter("movieId")));
		 movie.setMovieName(request.getParameter("movieName"));
		 movie.setDirector(request.getParameter("director"));
		 movie.setGenre(request.getParameter("genre"));
		 movie.setRating(Double.parseDouble(request.getParameter("rating")));
		 
		 dao.add(movie);
		 

			dispatcher.forward(request, response);
			
		
//		doGet(request, response);
	}

}
