package com.xworkz.service;

import com.xworkz.dto.MovieDTO;
import com.xworkz.repository.MovieRepoImp;

public class MovieServiceImp implements MovieService{

	@Override
	public boolean validate(MovieDTO movieDTO) {
		
		boolean isvalid=true;
		
		if(movieDTO!=null)
		{
			System.out.println("this is not null");
			
			String moviename=movieDTO.getMovieName();
			if(moviename!=null&& moviename.length()>6&&moviename.length()<14)
			{
				System.out.println("moviename is valid");
				isvalid=true;
			}
			else
			{
				System.out.println("moviename is not valid");
				isvalid=false;
			}
			String theatrename=movieDTO.getTheatreName();
			if(theatrename!=null&& theatrename.length()>6&&theatrename.length()<14)
			{
				System.out.println("theatrename is valid");
				isvalid=true;
			}
			else
			{
				System.out.println("theatrename is not valid");
				isvalid=false;
			}
			
			double ticketprice=movieDTO.getTicketPrice();
			if(ticketprice>0&&ticketprice<500)
			{
				System.out.println("ticketprice is valid");
				isvalid=true;
			}
			else
			{
				System.out.println("ticketprice is not valid");
				isvalid=false;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		MovieRepoImp movieRepository = new MovieRepoImp();
		movieRepository.save(movieDTO);
	
		return false;
	}

}
