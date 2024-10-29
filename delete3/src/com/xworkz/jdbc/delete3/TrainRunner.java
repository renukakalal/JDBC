package com.xworkz.jdbc.delete3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TrainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:mysql://localhost:3306/railwaystation";
		String userName="root";
		String password="Xworkzodc@123";
		
		String deleteQuery = "DELETE FROM train_info WHERE train_name = 'tandav'";
		String deleteQuery1 = "DELETE FROM train_info WHERE train_name = 'Betwa Express'";
		String deleteQuery2 = "DELETE FROM train_info WHERE train_name = 'Bhagirathi Express'";
		String deleteQuery3 = "DELETE FROM train_info WHERE train_name = 'Bhopal Express'";
		String deleteQuery4 = "DELETE FROM train_info WHERE train_name = 'Bhubaneswar Express'";
		String deleteQuery5 = "DELETE FROM train_info WHERE train_name = 'Bhuj Bdts Express'";
		String deleteQuery6 = "DELETE FROM train_info WHERE train_name = 'Bl Shramik Express'";
		String deleteQuery7 = "DELETE FROM train_info WHERE train_name = 'Cocanada Express'";
		String deleteQuery8 = "DELETE FROM train_info WHERE train_name = 'Cnb Garib Rath'";
		String deleteQuery9 = "DELETE FROM train_info WHERE train_name = 'Chennai Express'";
		

		
		Connection connection=null;
		
		try {
		connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		 int value= statement.executeUpdate(deleteQuery);
		 int value1= statement.executeUpdate(deleteQuery1);
         int value2= statement.executeUpdate(deleteQuery2);
         int value3= statement.executeUpdate(deleteQuery3);
         int value4= statement.executeUpdate(deleteQuery4);
         int value5= statement.executeUpdate(deleteQuery5);
         int value6= statement.executeUpdate(deleteQuery6);
         int value7= statement.executeUpdate(deleteQuery7);
         int value8= statement.executeUpdate(deleteQuery8);
         int value9= statement.executeUpdate(deleteQuery9);
        
		
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


