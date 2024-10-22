package com.xworkz.runner;

public class WaterRunner {

	public static void main(String[] args) {
	
		
		try
		{
			Class.forName("com.xworkz.biscuit.Water");
			System.out.println("Water is Running");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver class is Running");
		}

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Water is Running");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver class is Running");
		}
	}

}
