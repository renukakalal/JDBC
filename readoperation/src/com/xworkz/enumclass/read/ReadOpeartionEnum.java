package com.xworkz.enumclass.read;

public enum ReadOpeartionEnum {
	URL("jdbc:mysql://localhost:3306/register"),USERNAME("root"),PASSWORD("Xworkzodc@123");
		
		
		private final String value;

		private ReadOpeartionEnum(String value) {
			this.value=value;
			System.out.println("this is value:"+value);
		}
	
		public String getValue()
		{
			return value;
		}
		
	

}
