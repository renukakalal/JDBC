package com.xworkz.readopeations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;

public class QueryNo3 {
	public static void main(String[] args)
	{
	
	String selectQuery3 = "select employee_address from employee_details where emplyee_name='virat' and employee_ph='907645387';";
	
	Connection connection = null;

	try {

		connection = DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(selectQuery3);

		while (resultSet.next()) {
			System.out.println(resultSet.getString("employee_address"));
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}

	}




		}



