package com.xworkz.runner;

public class ChocolateRunner {
	
	public static  void main(String[] args)
	{
		try{
			Class.forName("com.xworkz.biscuit.Chocolate");
			System.out.println("This is Running");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
