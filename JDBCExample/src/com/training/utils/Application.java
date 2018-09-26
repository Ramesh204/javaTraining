package com.training.utils;

import com.training.entity.Movie;
import com.training.entity.*;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(DbConnections.getOracleConnection());
		
		//Movie gold = new Movie(101,"Gold","Reema","Historical",4.8);
		//Movie movie2 = new Movie(102,"InfintiyWar","Reema","Scientific",4.9);
		//Movie movie3 = new Movie(103,"starWars","Reema","Scientific",4.4);
		
		
		System.out.println("Hello");
		DAO dao = new MovieDAIimpl();
		
		//int rowAdded = dao.addMovie(movie3);
		
		
		//System.out.println(rowAdded +"row Added");
		
		
		
		System.out.println(dao.findByPrimarykey(102));
		
		
		((MovieDAIimpl)dao).closeConnection();
	}

}
