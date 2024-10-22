package com.xworkz.biscuit;

public class Biscuit {

	static {
		System.out.println("this is static block");
	}
	{
		System.out.println("this is instance block");
	}
}
