package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HolidayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String url = "jdbc:mysql://localhost:3306/holiday";
	        String userName = "root";
	        String password = "Xworkzodc@123";
	        // Corrected update query with proper syntax
	        String updateQuery = "UPDATE student_details SET student_name = 'swati', student_usn = 'SW20CSE100' WHERE student_id = 1";
	        String updateQuery1	= "UPDATE student_details SET student_name = 'salman', student_usn = 'SW20CSE101' WHERE student_id = 2";
	        String updateQuery2	= "UPDATE student_details SET student_name = 'khushi', student_usn = 'SW20CSE102' WHERE student_id = 3";
	        String updateQuery3	= "UPDATE student_details SET student_name = 'sundar', student_usn = 'SW20CSE103' WHERE student_id = 4";
	        String updateQuery4	= "UPDATE student_details SET student_name = 'vishwa', student_usn = 'SW20CSE104' WHERE student_id = 5";
	        String updateQuery5	= "UPDATE student_details SET student_name = 'kumar', student_usn = 'SW20CSE105' WHERE student_id = 6";
	        String updateQuery6	= "UPDATE student_details SET student_name = 'alia', student_usn = 'SW20CSE106' WHERE student_id = 7";
	        String updateQuery7	= "UPDATE student_details SET student_name = 'keertana', student_usn = 'SW20CSE107' WHERE student_id = 8";
	        String updateQuery8	= "UPDATE student_details SET student_name = 'pinky', student_usn = 'SW20CSE108' WHERE student_id = 9";
	        String updateQuery9	= "UPDATE student_details SET student_name = 'ganesh', student_usn = 'SW20CSE109' WHERE student_id = 10";
	        
	        Connection connection = null;

	        try {
	            // Establish connection
	            connection = DriverManager.getConnection(url, userName, password);
	            if (connection != null) {
	                System.out.println("Connected to the database.");

	                // Create a statement and execute the update query
	                Statement statement = connection.createStatement();
	                int value= statement.executeUpdate(updateQuery);
	                int value1= statement.executeUpdate(updateQuery1);
	                int value2= statement.executeUpdate(updateQuery2);
	                int value3= statement.executeUpdate(updateQuery3);
	                int value4= statement.executeUpdate(updateQuery4);
	                int value5= statement.executeUpdate(updateQuery5);
	                int value6= statement.executeUpdate(updateQuery6);
	                int value7= statement.executeUpdate(updateQuery7);
	                int value8= statement.executeUpdate(updateQuery8);
	                int value9= statement.executeUpdate(updateQuery9);
	                
	                System.out.println("this is connected");
	            } else {
	                System.out.println("this is not connected");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           
	                    System.out.println("Connection closed.");
	             
	        }
	}}
	


