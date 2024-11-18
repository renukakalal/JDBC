package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDTO;

public interface MovieRepository {
	
	boolean save(MovieDTO movieDTO);

}
