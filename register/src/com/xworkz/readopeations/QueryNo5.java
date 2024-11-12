package com.xworkz.readopeations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;

public class QueryNo5 {
	public static void main(String[] args)
	{
	
String selectQuery5 = "select employee_email,employee_password from employee_details where employee_ph='66746645';";
	
Connection connection = null;

try {

	connection = DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(selectQuery5);

	while (resultSet.next()) {
		System.out.println(resultSet.getString("employee_email"));
		System.out.println(resultSet.getString("employee_password"));
	}

} catch (SQLException e) {
	e.printStackTrace();
}

}
	}


