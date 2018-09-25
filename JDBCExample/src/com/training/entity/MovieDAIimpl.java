package com.training.entity;

import java.sql.*;
import java.util.*;

import com.training.utils.DbConnections;

public class MovieDAIimpl implements MovieDAO {

	private Connection conn;
	
	private Movie convertToObject(ResultSet rs) throws SQLException{
		
		long movieId = rs.getLong("movieId");
		String movieName = rs.getString("movieName");
		String director = rs.getString("director");
		String genre = rs.getString("genre");
		Double rating = rs.getDouble("rating");
		
		Movie movie = new Movie(movieId,movieName,director,genre,rating);
		
		return movie;
	
	}
	
	
	public MovieDAIimpl() {
		super();
		conn = DbConnections.getOracleConnection();
	}

	@Override
	public int addMovie(Movie movie) {
		
		String sql = "insert into movieanant values(?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		int rowAdded = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, movie.getMovieId());
			pstmt.setString(2, movie.getMovieName());
			pstmt.setString(3, movie.getDirector());
			pstmt.setString(4, movie.getGenre());
			pstmt.setDouble(5, movie.getRating());
			rowAdded = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowAdded;
	}

	
	public void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Movie> findAll() {
		
		String sql = "select * from movieanant";
	
		PreparedStatement pstmt = null;
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs);
			while(rs.next())
			{
				long movieId = rs.getLong("movieId");
				String movieName = rs.getString("movieName");
				String director = rs.getString("director");
				String genre = rs.getString("genre");
				Double rating = rs.getDouble("rating");
				
				Movie movie = new Movie(movieId,movieName,director,genre,rating);
				movieList.add(movie);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		return movieList;
	}

	@Override
	public int remove(long movieId) {
		
		String sql = "delete from  movieanant where movieId=?";
		PreparedStatement pstmt = null;
		int rowsDeleted = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, movieId);
			rowsDeleted = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return rowsDeleted;
	}

	@Override
	public int updateRating(long movieId, double currentRating) {
		
		String sql = "update movieanant set rating = ? where movieId =?";
		PreparedStatement pstmt = null;
		int rowUpdated  = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, currentRating);
			pstmt.setLong(2, movieId);
			rowUpdated = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return rowUpdated;
		
	}

	@Override
	public Movie findByPrimarykey(long movieId) {
		String sql = "select * from movieanant where movieId =?";
		PreparedStatement pstmt = null;
		Movie movie = null;
		 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1,movieId);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			if(rs.next())
			{
				movie = convertToObject(rs);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return movie;
	}

}
