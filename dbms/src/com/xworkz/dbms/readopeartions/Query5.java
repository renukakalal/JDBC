package com.xworkz.dbms.readopeartions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dbms.enumclass.DataBase;



public class Query5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String selectQuery5 = "select cust_email,cust_password from cust_details where cust_ph=4567890123,cust_name='Emily';";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(DataBase.URL.getValue(),DataBase.USERNAME.getValue(),DataBase.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("cust_email"));
				System.out.println(resultSet.getString("cust_password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		}
			

	}


