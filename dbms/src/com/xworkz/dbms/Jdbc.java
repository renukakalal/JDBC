package com.xworkz.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.dbms.enumclass.DataBase;



public class Jdbc {
	
	
	public static void main(String[] args)
	{
		
    Connection connection=null;
    
    String insertQuery= "INSERT INTO cust_details VALUES (1, 'John', 'Doe', 'john.doe@example.com', 1234567890, 500, 300, 200, '5%', 4.5, 'jd12345', 'New York')";
    String insertQuery1="INSERT INTO cust_details VALUES (2, 'Jane', 'Smith', 'jane.smith@example.com', 2345678901, 750, 500, 250, '10%', 4.0, 'js23456', 'Los Angeles')";
    String insertQuery2="INSERT INTO cust_details VALUES (3, 'Michael', 'Johnson', 'michael.j@example.com', 3456789012, 1000, 800, 200, '15%', 3.8, 'mj34567', 'Chicago')";
    String insertQuery3="INSERT INTO cust_details VALUES (4, 'Emily', 'Davis', 'emily.davis@example.com', 4567890123, 600, 400, 200, '8%', 4.3, 'ed45678', 'Houston')";
    String insertQuery4="INSERT INTO cust_details VALUES (5, 'Daniel', 'Brown', 'daniel.brown@example.com', 5678901234, 900, 700, 200, '12%', 4.7, 'db56789', 'Phoenix')";
    String insertQuery5="INSERT INTO cust_details VALUES (6, 'Sarah', 'Wilson', 'sarah.wilson@example.com', 6789012345, 550, 350, 200, '10%', 4.1, 'sw67890', 'San Antonio')";
    String insertQuery6= "INSERT INTO cust_details VALUES (7, 'David', 'Lee', 'david.lee@example.com', 7890123456, 800, 500, 300, '5%', 4.6, 'dl78901', 'San Diego')";
    String insertQuery7="INSERT INTO cust_details VALUES (8, 'Laura', 'Martinez', 'laura.martinez@example.com', 8901234567, 620, 420, 200, '12%', 4.2, 'lm89012', 'Dallas')";
    String insertQuery8="INSERT INTO cust_details VALUES (9, 'James', 'Anderson', 'james.anderson@example.com', 9012345678, 720, 500, 220, '8%', 3.9, 'ja90123', 'San Jose')";
    String insertQuery9="INSERT INTO cust_details VALUES (10, 'Olivia', 'Thomas', 'olivia.thomas@example.com', 1234567899, 450, 250, 200, '6%', 4.4, 'ot12345', 'Austin')";
    String insertQuery10="INSERT INTO cust_details VALUES (11, 'Ethan', 'Jackson', 'ethan.jackson@example.com', 2345678902, 690, 400, 290, '9%', 4.5, 'ej23456', 'Jacksonville')";
    String insertQuery11="INSERT INTO cust_details VALUES (12, 'Mia', 'White', 'mia.white@example.com', 3456789013, 760, 560, 200, '10%', 4.3, 'mw34567', 'Fort Worth')";
    String insertQuery12="INSERT INTO cust_details VALUES (13, 'Jacob', 'Harris', 'jacob.harris@example.com', 4567890124, 900, 700, 200, '7%', 4.8, 'jh45678', 'Columbus')";
    String insertQuery13="INSERT INTO cust_details VALUES (14, 'Isabella', 'Clark', 'isabella.clark@example.com', 5678901235, 670, 470, 200, '9%', 4.0, 'ic56789', 'Charlotte')";
    String insertQuery14="INSERT INTO cust_details VALUES (15, 'Matthew', 'Rodriguez', 'matthew.rodriguez@example.com', 6789012346, 810, 600, 210, '12%', 4.5, 'mr67890', 'San Francisco')";
    String insertQuery15="INSERT INTO cust_details VALUES (16, 'Sophia', 'Lewis', 'sophia.lewis@example.com', 7890123457, 530, 330, 200, '5%', 4.2, 'sl78901', 'Indianapolis')";
    String insertQuery16="INSERT INTO cust_details VALUES (17, 'Alexander', 'Walker', 'alex.walker@example.com', 8901234568, 850, 650, 200, '10%', 4.7, 'aw89012', 'Seattle')";
    String insertQuery17="INSERT INTO cust_details VALUES (18, 'Chloe', 'Hall', 'chloe.hall@example.com', 9012345679, 730, 530, 200, '11%', 4.1, 'ch90123', 'Denver')";
    String insertQuery18="INSERT INTO cust_details VALUES (19, 'Benjamin', 'Allen', 'benjamin.allen@example.com', 1234567891, 570, 370, 200, '6%', 4.6, 'ba12345', 'Washington DC')";
    String insertQuery19="INSERT INTO cust_details VALUES (20, 'Amelia', 'King', 'amelia.king@example.com', 2345678903, 780, 580, 200, '9%', 4.3, 'ak23456', 'Boston')";

		try {
			connection=DriverManager.getConnection(DataBase.URL.getValue(),DataBase.USERNAME.getValue(),DataBase.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			
			statement.executeUpdate(insertQuery1);
			statement.executeUpdate(insertQuery2);
			statement.executeUpdate(insertQuery3);
			statement.executeUpdate(insertQuery4);
			statement.executeUpdate(insertQuery5);
			statement.executeUpdate(insertQuery6);
			statement.executeUpdate(insertQuery7);
			statement.executeUpdate(insertQuery9);
			statement.executeUpdate(insertQuery8);
			statement.executeUpdate(insertQuery10);
			statement.executeUpdate(insertQuery11);
			statement.executeUpdate(insertQuery12);
			statement.executeUpdate(insertQuery13);
			statement.executeUpdate(insertQuery14);
			statement.executeUpdate(insertQuery15);
			statement.executeUpdate(insertQuery16);
			statement.executeUpdate(insertQuery17);
			statement.executeUpdate(insertQuery18);
			statement.executeUpdate(insertQuery19);
			
			
			
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

