package com.xworkz.enumprestatement;

public enum RegisterEnum {
	
	URL("jdbc:mysql://localhost:3306/cust_details"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	
	private RegisterEnum(String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return value;
		
	}

}
