package com.xworkz.dbms.readopeartions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dbms.enumclass.DataBase;



public class Query3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String selectQuery3 = "select cust_address from cust_details where cust_name='Olivia' and cust_ph=1234567899;";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(DataBase.URL.getValue(),DataBase.USERNAME.getValue(),DataBase.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("cust_address"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		}



	}


