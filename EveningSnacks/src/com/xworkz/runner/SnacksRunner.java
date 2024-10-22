package com.xworkz.runner;

public class SnacksRunner {
	
	public static void main(String[] args)
	{
		
	
	try
	{
		Class.forName("com.xworkz.biscuit.Snacks");
		System.out.println("This is running");
	}
	catch(ClassNotFoundException e)
	
	{
		e.printStackTrace();
		
	}
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Running");
	}
	catch(ClassNotFoundException e)
	
	{
		e.printStackTrace();
		
	}
}
}


