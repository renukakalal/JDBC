package com.xworkz.register.enumclass;

public enum Details {
	
	URL("jdbc:mysql://localhost:3306/employees"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	
	private final String value;

	private Details(String value) {
		this.value=value;
		System.out.println("this is value:"+value);
	}

	public String getValue()
	{
		return value;
	}
	


}



