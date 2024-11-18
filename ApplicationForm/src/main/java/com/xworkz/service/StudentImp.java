package com.xworkz.service;

import com.xworkz.dto.StudentDTO;

public class StudentImp implements StudentService {

	@Override
	public boolean validate(StudentDTO studentDTO) {
		
		
		System.out.println("service is running");
		
		return false;
	}

}
