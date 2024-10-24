package com.xworkz.bottlerunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BottleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String url="jdbc:mysql://localhost:3306/states";
	String userName="root";
	String password="Xworkzodc@123";
	String insertQuery="insert into state_detalis values(20,'Tamil Nadu','Shri M. K. Stalin')";

	

	
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
