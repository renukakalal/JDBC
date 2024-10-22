package com.xworkz.runner;

public class CakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			Class.forName("com.xworkz.biscuit.Cake");
			System.out.println("Cake class is Running");
		}
		catch(ClassNotFoundException e)
		{
		e.printStackTrace();	
		}
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("This Driver is Running");
		}
		catch(ClassNotFoundException e)
		{
		e.printStackTrace();	
		}
		

	}

}
