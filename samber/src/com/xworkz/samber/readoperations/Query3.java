package com.xworkz.samber.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.Idli;

public class Query3 {

	public static void main(String[] args) {
		String query3 = "SELECT Samber_Type FROM new_table WHERE samber_name = 'Udupi Style Sambar' AND samber_price = 130";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("Samber_Type"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
	

	}


