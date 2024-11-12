package com.xworkz.dbms.readopeartions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dbms.enumclass.DataBase;



public class Query1 {

	public static void main(String[] args) {
		
		String selectQuery1 = "select* from cust_details ;";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(DataBase.URL.getValue(),DataBase.USERNAME.getValue(),DataBase.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery1);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("cust_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	}


