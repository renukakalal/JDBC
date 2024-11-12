package com.xworkz.readopeations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;

public class QueryNo4 {
	public static void main(String[] args)
	{
	
	String selectQuery4 = "select employee_email,employee_password from employee_details where employee_ph='764524357';";
	
	Connection connection = null;
	
	try {

		connection = DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(selectQuery4);

		while (resultSet.next()) {
			System.out.println(resultSet.getString("employee_address"));
			System.out.println(resultSet.getString("employee_password"));
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
