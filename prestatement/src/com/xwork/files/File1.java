package com.xwork.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.xworkz.enumprestatement.RegisterEnum;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Connection connection=null;
		
		PreparedStatement prst=null;
		
		connection=DriverManager.getConnection(RegisterEnum.URL.getValue(),RegisterEnum.USERNAME.getValue(),RegisterEnum.PASSWORD.getValue());
       
		prst=connection.prepareStatement("insert into new_table values(?,?,?,?)");
		
		prst.setInt(1,1);
		prst.setString(2,"BlackCat");
		prst.setString(3,"rum");
		prst.setInt(4,500);
		
		prst.setInt(1,2);
		prst.setString(2,"BlackCat");
		prst.setString(3,"Whiskey");
		prst.setInt(4,1000);
		
		prst.setInt(1,3);
		prst.setString(2,"Blenders Pride");
		prst.setString(3,"Whiskey");
		prst.setInt(4,3000);
		
		prst.setInt(1,4);
		prst.setString(2,"Magic Moments ");
		prst.setString(3,"Vodka");
		prst.setInt(4,3600);
		
		
		prst.setInt(1,5);
		prst.setString(2,"White Mischief  ");
		prst.setString(3,"Vodka");
		prst.setInt(4,3600);
		
		prst.setInt(1,6);
		prst.setString(2,"Old Admiral");
		prst.setString(3,"Brandy");
		prst.setInt(4,2400);
		
		
		prst.setInt(1,7);
		prst.setString(2,"Mansion House ");
		prst.setString(3,"Brandy");
		prst.setInt(4,4500);
		
		prst.setInt(1,8);
		prst.setString(2,"Mansion House ");
		prst.setString(3,"Brandy");
		prst.setInt(4,3000);
		
		prst.setInt(1,9);
		prst.setString(2,"Romanov");
		prst.setString(3,"Vodka");
		prst.setInt(4,7000);
		
		prst.setInt(1,10);
		prst.setString(2,"McDowell’s No. 1");
		prst.setString(3,"Whiskey");
		prst.setInt(4,550);
		
		prst.setInt(1,11);
		prst.setString(2,"Officer’s Choice ");
		prst.setString(3,"Whiskey");
		prst.setInt(4,650);
		
		
		prst.setInt(1,12);
		prst.setString(2,"Bagpiper ");
		prst.setString(3,"Whiskey");
		prst.setInt(4,390);
		
		
		prst.setInt(1,13);
		prst.setString(2,"Red Romanov ");
		prst.setString(3,"Vodka");
		prst.setInt(4,430);
		
		
		prst.setInt(1,14);
		prst.setString(2,"Smoke Vodka ");
		prst.setString(3,"Vodka");
		prst.setInt(4,560);
		
		
		prst.setInt(1,15);
		prst.setString(2,"Bagpiper ");
		prst.setString(3,"Whiskey");
		prst.setInt(4,670);
		
		
		
		
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
