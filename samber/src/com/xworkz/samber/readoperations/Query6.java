package com.xworkz.samber.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.Idli;

public class Query6 {

	public static void main(String[] args) {
	
		String query6 = "SELECT samber_Brand FROM new_table WHERE id>5";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query6);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("samber_Brand"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}


