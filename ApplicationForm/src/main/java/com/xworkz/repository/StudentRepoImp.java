package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dto.StudentDTO;
import com.xworkz.enumclass.StudentEnum;

public class StudentRepoImp implements StudentRepo {
	

	@Override
	public boolean save(StudentDTO studentDTO) {
      
		
		
		System.out.println("repository is running");
		Connection connection = null;
		PreparedStatement prept = null;
		boolean ifSaved = false;
		

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}


		try {
			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(),StudentEnum.PASSWORD.getValue());
			prept = connection.prepareStatement("insert into new_table values(?,?,?,?,?,?,?,?)");

			prept.setString(1, studentDTO.getName());
			prept.setString(2, studentDTO.getEmail());
			prept.setLong(3, studentDTO.getPhoneNumber());
			prept.setString(4, studentDTO.getGraduation());
			prept.setString(5, studentDTO.getBranch());
			prept.setInt(6, studentDTO.getCgpa());
			prept.setString(7, studentDTO.getSkills());
			prept.setString(8, studentDTO.getAddress());

			int value = prept.executeUpdate();

			if (value > 0) {
				System.out.println("this is saved");
				 ifSaved = true;

			} else {
				System.out.println("this is not saved");
				ifSaved = true;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return false;
	
}
}
