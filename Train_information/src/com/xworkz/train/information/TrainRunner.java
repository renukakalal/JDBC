package com.xworkz.train.information;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TrainRunner {
	
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/railwaystation";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into train_info values(20,'Chennai Express','Rameswaram')";

		

		
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

