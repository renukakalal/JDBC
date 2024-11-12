package com.xworkz.readopeations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;

public class QueryNo2 {
	public static void main(String[] args)
	{
	
String selectQuery2 = "select emplyee_name from employee_details where employee_email='virat@gmail.com' and employee_ph='907645387';";
Connection connection = null;

try {

	connection = DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(selectQuery2);

	while (resultSet.next()) {
		System.out.println(resultSet.getString("emplyee_name"));
	}

} catch (SQLException e) {
	e.printStackTrace();
}

}




	}


