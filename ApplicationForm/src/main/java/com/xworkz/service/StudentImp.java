package com.xworkz.service;

import com.xworkz.dto.StudentDTO;
import com.xworkz.repository.StudentRepo;
import com.xworkz.repository.StudentRepoImp;

public class StudentImp implements StudentService {

	@Override
	public boolean validate(StudentDTO studentDTO) {
		
		
		System.out.println("service is running");
		
		
		boolean isvalid=true;
		if(studentDTO!=null)
		{
			
			String name=studentDTO.getName();
			if(name!=null&& name.length()>6&&name.length()<14)
			{
				System.out.println("name is correct");
				isvalid=true;
			}
			else
			{
				System.out.println("this is not corrct");
				isvalid=false;
			}
			String email=studentDTO.getEmail();
			if (studentDTO.getEmail() == null && !(studentDTO.getEmail().contains("@") && (studentDTO.getEmail().endsWith(".com") && studentDTO.getEmail().indexOf('@') == 8)))
			{
				System.out.println("email is valid");
				isvalid=true;
			}else
			{
				System.out.println("email is in valid");
				isvalid=false;
			}
			long number=studentDTO.getPhoneNumber();
			Long.toString(number);
			
			int cgpa=studentDTO.getCgpa();
			if(cgpa>5)
			{
				System.out.println("cgpa  is valid");
				isvalid=true;
			}
			else
			{
				System.out.println("cgpa  is not valid");
				isvalid=false;
			}
			String address=studentDTO.getAddress();
			if(address!=null&&address.length()>30)
			{
				System.out.println("address  is valid");
				isvalid=true;
			}else
			{
				System.out.println("address  is not valid");
				isvalid=false;
			}
			
			
			
			
		}
		
		
		
		
		StudentRepo StudentRepoImp=new StudentRepoImp();
		
		boolean saved=StudentRepoImp.save(studentDTO);
		
		if(saved)
		{
			System.out.println("this is saved");
		}
		else
		{
			System.out.println("this is not saved");
		}
		
		
		return false;
	}

}
