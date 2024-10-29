package com.xworkz.jdbc.holiday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Holidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/holiday";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into student_details values(5, 'hari', 'SW20CSE005)";
			
		

		
		Connection connection=null;
		
		try {
		connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		statement.executeUpdate(insertQuery);
		
		if(connection!=null)
		{
			System.out.println("this is connected");
		}
		else
		{
			System.out.println("this is not connected");
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		}
	}
