package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String url="jdbc:mysql://localhost:3306/states";
				String userName="root";
				String password="Xworkzodc@123";
				
				String updateQuery1 = "UPDATE state_detalis SET  state_capital = 'Banglore' WHERE state_id = 1";	
				String updateQuery2 = "UPDATE state_detalis SET  state_capital = 'Hydrabad' WHERE state_id = 2";	
				String updateQuery3 = "UPDATE state_detalis SET  state_capital = 'Mumbai' WHERE state_id = 3";	
				String updateQuery4 = "UPDATE state_detalis SET  state_capital= 'Lucknow' WHERE state_id = 3";	
				String updateQuery5 = "UPDATE state_detalis SET  state_capital = 'Lucknow' WHERE state_id = 4";	
				String updateQuery6 = "UPDATE state_detalis SET  state_capital = 'Amaravati' WHERE state_id = 5";	
				String updateQuery7 = "UPDATE state_detalis SET  state_capital = 'itanagar' WHERE state_id = 6";	
				String updateQuery8 = "UPDATE state_detalis SET state_capital = 'patna' WHERE state_id = 7";	
				String updateQuery9 = "UPDATE state_detalis SET  state_capital = 'ranchi' WHERE state_id = 9";	
				String updateQuery10 = "UPDATE state_detalis SET  state_capital = 'kohim' WHERE state_id = 14";	
				
				
				Connection connection = null;
				try {
				connection=DriverManager.getConnection(url, userName, password);
				Statement statement=connection.createStatement();
				  
				    int value1= statement.executeUpdate(updateQuery1);
	                int value2= statement.executeUpdate(updateQuery2);
	                int value3= statement.executeUpdate(updateQuery3);
	                int value4= statement.executeUpdate(updateQuery4);
	                int value5= statement.executeUpdate(updateQuery5);
	                int value6= statement.executeUpdate(updateQuery6);
	                int value7= statement.executeUpdate(updateQuery7);
	                int value8= statement.executeUpdate(updateQuery8);
	                int value9= statement.executeUpdate(updateQuery9);
	                int value10= statement.executeUpdate(updateQuery10);
	                
				
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


