package com.xworkz.enumclass;

public enum StudentEnum {

	URL("jdbc:mysql://localhost:3306/application"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private StudentEnum(String value) {
		this.value = value;
		
		System.out.println("enum is running");
	}

	public String getValue() {
		return value;

	}

}
