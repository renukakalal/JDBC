package com.xworkz.samber.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.Idli;

public class Query4 {

	public static void main(String[] args) {
		
		String query4 = "SELECT samber_name,samber_Ingredients FROM new_table where samber_Quantity=1 ";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query4);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("samber_name"));
				System.out.println(resultSet.getString("samber_Ingredients"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	}


