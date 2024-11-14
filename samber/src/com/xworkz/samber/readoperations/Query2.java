package com.xworkz.samber.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.Idli;

public class Query2 {

	public static void main(String[] args) {
		
		
        String query2 = "SELECT samber_name  FROM new_table WHERE famous_place = 'Mysore' AND samber_price = 155.5";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("samber_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
	}


