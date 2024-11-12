package com.xworkz.jdbc.readoperationclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.read.ReadOpeartionEnum;



public class Query2 {

	public static void main(String[] args) {
		String selectQuery2 = "select std_name from stu_details where std_email='isha@gmail.com' and std_ph=s680370373;";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(ReadOpeartionEnum.URL.getValue(),ReadOpeartionEnum.USERNAME.getValue(),ReadOpeartionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("std_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
