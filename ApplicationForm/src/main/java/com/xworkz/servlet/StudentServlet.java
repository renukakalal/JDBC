package com.xworkz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.StudentDTO;
import com.xworkz.repository.StudentRepo;
import com.xworkz.repository.StudentRepoImp;
import com.xworkz.service.StudentImp;

@WebServlet(loadOnStartup=1,urlPatterns="/application")
public class StudentServlet extends HttpServlet {
	
    public StudentServlet()
    {
        super();
        
       System.out.println("servlet is running"); 
    } 
	

	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	String name=req.getParameter("yourName");	
	String email=req.getParameter("email");
	String number=req.getParameter("number");
	long convertednumber=Long.valueOf(number);
	String graduation=req.getParameter("graduation");
	String branch=req.getParameter("branch");
	String cgpa=req.getParameter("cgpa");
	int convertedcgpa=Integer.valueOf(cgpa);
	String skills=req.getParameter("skills");
	String address=req.getParameter("address");
	
	
	StudentDTO studentDTO=new StudentDTO(name,email,convertednumber,graduation,branch,convertedcgpa,skills,address);
	
	
	
	System.out.println("this is name:"+name);
	System.out.println("tis is name:"+email);
	System.out.println("tis is name:"+convertednumber);
	System.out.println("tis is name:"+graduation);
	System.out.println("tis is name:"+convertedcgpa);
	System.out.println("tis is name:"+skills);
	System.out.println("tis is name:"+address);
	
	
	}
}



