package com.xworkz.jdbc.readoperationclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.read.ReadOpeartionEnum;


public class Query3 {

	public static void main(String[] args) {
		String selectQuery3 = "select std_location from stu_details where std_name='kumar' and std_ph='876453200';";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(ReadOpeartionEnum.URL.getValue(),ReadOpeartionEnum.USERNAME.getValue(),ReadOpeartionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("std_location"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
