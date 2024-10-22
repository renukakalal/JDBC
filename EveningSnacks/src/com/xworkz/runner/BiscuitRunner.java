package com.xworkz.runner;

public class BiscuitRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("this is Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			Class.forName("com.xworkz.biscuit.Biscuit");
			System.out.println("this is Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}
}
