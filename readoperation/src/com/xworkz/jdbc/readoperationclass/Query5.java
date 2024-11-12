package com.xworkz.jdbc.readoperationclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.read.ReadOpeartionEnum;


public class Query5 {

	public static void main(String[] args) {
		String selectQuery5 = "select std_email,std_password from stu_details where std_ph='680370373';";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(ReadOpeartionEnum.URL.getValue(),ReadOpeartionEnum.USERNAME.getValue(),ReadOpeartionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("std_email"));
				System.out.println(resultSet.getString("std_password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		}
	}


