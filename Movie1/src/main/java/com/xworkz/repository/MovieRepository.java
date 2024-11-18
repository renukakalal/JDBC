package com.xworkz.repository;

import com.xworkz.dto.MovieDTO;

public interface MovieRepository {
	
	boolean save(MovieDTO movieDTO);

}
