package com.xworkz.enumprestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class File2 {

	public static void main(String[] args) {
		
		try {
			Connection connection=null;
			
			PreparedStatement prst=null;
			
			connection=DriverManager.getConnection(RegisterEnum.URL.getValue(),RegisterEnum.USERNAME.getValue(),RegisterEnum.PASSWORD.getValue());
	       
			prst=connection.prepareStatement("insert into new_table values(?,?,?,?)");
			
			prst.setInt(1,1);
			prst.setString(2,"sohita");
			prst.setInt(3,90);
			prst.setString(4,"gulbargha");
			
			prst.setInt(1,2);
			prst.setString(2,"isha");
			prst.setInt(3,75);
			prst.setString(4,"mumbai");
			
			
			prst.setInt(1,3);
			prst.setString(2,"sachin");
			prst.setInt(3,70);
			prst.setString(4,"gulbarga");
			
			
			prst.setInt(1,4);
			prst.setString(2,"srihari");
			prst.setInt(3,72);
			prst.setString(4,"gurmitakal");
			
			prst.setInt(1,5);
			prst.setString(2,"siri");
			prst.setInt(3,50);
			prst.setString(4,"usa");
			
			
			
			prst.setInt(1,6);
			prst.setString(2,"pavan");
			prst.setInt(3,50);
			prst.setString(4,"banglore");
			
			prst.setInt(1,7);
			prst.setString(2,"elon");
			prst.setInt(3,55);
			prst.setString(4,"banglore");
			
			prst.setInt(1,8);
			prst.setString(2,"markzukarbarg");
			prst.setInt(3,55);
			prst.setString(4,"usa");
			
			
			prst.setInt(1,9);
			prst.setString(2,"vishal");
			prst.setInt(3,55);
			prst.setString(4,"yadgri");
			
			prst.setInt(1,10);
			prst.setString(2,"hareesha");
			prst.setInt(3,87);
			prst.setString(4,"yadgri");
			
			
			prst.setInt(1,11);
			prst.setString(2,"varun");
			prst.setInt(3,87);
			prst.setString(4,"pune");
			
			
			prst.setInt(1,12);
			prst.setString(2,"hima");
			prst.setInt(3,87);
			prst.setString(4,"banglore");
			
			
			prst.setInt(1,13);
			prst.setString(2,"balu");
			prst.setInt(3,87);
			prst.setString(4,"hydrabad");
			
			
			prst.setInt(1,14);
			prst.setString(2,"keertana");
			prst.setInt(3,84);
			prst.setString(4,"hydrabad");
			
			
			
			prst.setInt(1,15);
			prst.setString(2,"swapna");
			prst.setInt(3,90);
			prst.setString(4,"banglore");
			
			
			
			int value=prst.executeUpdate();
			
			if(value>0)
			{
				System.out.println("saved");
			}
			else
			{
				System.out.println(" not saved");	
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}


	}


