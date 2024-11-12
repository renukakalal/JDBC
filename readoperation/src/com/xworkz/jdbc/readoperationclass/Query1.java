package com.xworkz.jdbc.readoperationclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumclass.read.ReadOpeartionEnum;



public class Query1 {

	public static void main(String[] args) {
		String selectQuery1  = "select* from stu_details ;";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(ReadOpeartionEnum.URL.getValue(),ReadOpeartionEnum.USERNAME.getValue(),ReadOpeartionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery1);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("std_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


		



	}


