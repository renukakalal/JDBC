package com.xworkz.dbms.readopeartions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dbms.enumclass.DataBase;


public class Query2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String selectQuery2 = "select emplyee_name from employee_details where employee_email='virat@gmail.com' and employee_ph='907645387';";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(DataBase.URL.getValue(),DataBase.USERNAME.getValue(),DataBase.PASSWORD.getValue());
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


