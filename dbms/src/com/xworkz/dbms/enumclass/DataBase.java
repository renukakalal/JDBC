package com.xworkz.dbms.enumclass;

public enum DataBase {
	
	URL("jdbc:mysql://localhost:3306/employees"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	
	private DataBase(String value) {
		this.value=value;
		}


	public String getValue()
	{
		return value;
	}

}
