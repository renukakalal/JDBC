
package com.xworkz.movie.constants;

public enum EnumMovie {

	URL("jdbc:mysql://localhost:3306/kgf"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private EnumMovie(String value) {
		this.value = value;

		System.out.println("enum is running");
	}

	public String getValue() {
		return value;

	}

}
