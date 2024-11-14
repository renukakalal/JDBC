package com.xworkz.enumclass;

public enum Idli {
	
URL("jdbc:mysql://localhost:3306/samber"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	
	private final String value;

	private Idli(String value) {
		this.value=value;
		System.out.println("this is value:"+value);
	}

	public String getValue()
	{
		return value;
	}

}
