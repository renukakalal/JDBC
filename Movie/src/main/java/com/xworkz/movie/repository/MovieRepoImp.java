package com.xworkz.movie.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.movie.constants.EnumMovie;
import com.xworkz.movie.dto.MovieDTO;

public class MovieRepoImp implements MovieRepository {

	@Override
	public boolean save(MovieDTO movieDTO) {

		boolean ifsaved = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			connection = DriverManager.getConnection(EnumMovie.URL.getValue(), EnumMovie.PASSWORD.getValue(),
					EnumMovie.USERNAME.getValue());
			PreparedStatement prept = null;
			prept = connection.prepareStatement("insert into new_table values(?,?,?,?,?)");

			prept.setInt(1, movieDTO.getMovieid());
			prept.setString(2, movieDTO.getMovieName());
			prept.setString(3, movieDTO.getTheatreName());
			prept.setDouble(4, movieDTO.getTicketPrice());
			prept.setInt(5, movieDTO.getNoOfTickets());

			int value = prept.executeUpdate();

			if (value > 0) {
				System.out.println("this is saved");
				ifsaved = true;
			} else {
				System.out.println("this is not saved");
				ifsaved = true;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return ifsaved;
	}

}
