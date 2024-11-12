package com.xworkz.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.register.enumclass.Details;


public class Register {
	public static void main(String[] args)
	{
		
String insertQuery1="insert into employee_details values(1,'ishan','sharma',10000,808847019,'mumbai','ishan123','ishan@gmail.com','maharastra','35000','10%','10000')";
String insertQuery2="insert into employee_details values(2,'suryakumar','yadav',50000,857648937,'pune','surya123','surya@gmail.com','maharastra','95000','12%','22000')";		
String insertQuery3="insert into employee_details values(3,'karan','sharma',30000,847474649,'kolkatta','karan123','karan@gmail.com','maharastra','85000','15%','15000')";		
String insertQuery4="insert into employee_details values(4,'vijay','devrkonda',80000,974523458,'banglore','vijay123','vijay@gmail.com','maharastra','65000','18%','28000')";
String insertQuery5="insert into employee_details values(5,'virat','kohli',90000,907645387,'banglore','virat123','virat@gmail.com','maharastra','55000','20%','47000')";
String insertQuery6="insert into employee_details values(6,'rohit','sharma',60000,764524357,'mumbai','rohit123','rohit@gmail.com','maharastra','45000','15%','98000')";
String insertQuery7="insert into employee_details values(7,'yashaswi','jaiswal',60000,66746645,'tajastan','yashaswi123','yashaswi@gmail.com','maharastra','15000','19%','76000')";
String insertQuery8="insert into employee_details values(8,'salman','khan',70000,97453685,'mumbai','salman123','salman@gmail.com','maharastra','67000','5%','37000')";
String insertQuery9="insert into employee_details values(9,'duplicy','faf',80000,987542345,'southafrica','duplicy123','duplicy@gmail.com','maharastra','99000','1%','89000')";
String insertQuery10="insert into employee_details values(10,'mahendrasingh','dhoni',90000,986547854,'rajastan','mahendrasingh123','mahendrasingh@gmail.com','maharastra','77000','3%','13000')";
String insertQuery11="insert into employee_details values(11,'renuka','kalal',10000,75869756,'kerala','renuka123','renuka@gmail.com','maharastra','22000','9%','9000')";
String insertQuery12="insert into employee_details values(12,'bhagya','hebbal',20000,985647378,'hydrabad','bhagya123','bhagya@gmail.com','maharastra','49000','7%','0000')";
String insertQuery13="insert into employee_details values(13,'sohita','patil',20000,98674564,'banglore','sohita123','sohita@gmail.com','maharastra','62000','8%','40000')";
String insertQuery14="insert into employee_details values(14,'mayank','dagar',40000,985734561,'pune','mayank123','mayank@gmail.com','maharastra','89000','19%','50000')";
String insertQuery15="insert into employee_details values(15,'alia','bhatt',80000,968085674,'chennai','alia123','alia@gmail.com','maharastra','80000','10%','40000')";
String insertQuery16="insert into employee_details values(16,'shraddha','kapoor',20000,896804537,'banglore','shraddha123','shraddha@gmail.com','maharastra','35000','2%','800')";
String insertQuery17="insert into employee_details values(17,'narendra','modi',70000,908674327,'gulbarga','narendra123','narendra@gmail.com','maharastra','45000','3%','90000')";
String insertQuery18="insert into employee_details values(18,'kalpana','rathod',80000,896745635,'banglore','kalpana123','kalpana@gmail.com','maharastra','37000','4%','62000')";
String insertQuery19="insert into employee_details values(19,'shubman','gill',10000,85096784,'banglore','shubman123','shubman@gmail.com','maharastra','33000','5%','98000')";
String insertQuery20="insert into employee_details values(20,'hardik','pandya',10000,908675649,'mumbai','hardik123','hardik@gmail.com','maharastra','55000','6%','40')";

Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(Details.URL.getValue(),Details.USERNAME.getValue(),Details.PASSWORD.getValue());
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
			statement.executeUpdate(insertQuery20);
			
			
			
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

