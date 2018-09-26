package com.training;

import com.training.entity.DAO;
import com.training.entity.Movie;

public interface MovieDAO extends DAO<Movie> {

	public int updateRating(long movieId,double currentRating);
}
