package com.xworkz.samber.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.Idli;

public class Query5 {

	public static void main(String[] args) {
		
		String query5 = "SELECT samber_Brand ,Samber_Color FROM new_table where Flavor= 'Tangy' AND Samber_Type = 'Spicy'";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("samber_Brand"));
				System.out.println(resultSet.getString("Samber_Color"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	

	}


