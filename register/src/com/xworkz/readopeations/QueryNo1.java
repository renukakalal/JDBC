package com.xworkz.readopeations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;

public class QueryNo1 {
	public static void main(String[] args)
	{
	
	String selectQuery1 = "select* from employee_details ;";
	
	Connection connection = null;

	try {

		connection = DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(selectQuery1);

		while (resultSet.next()) {
			System.out.println(resultSet.getString("emplyee_name"));
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}

}


	}


