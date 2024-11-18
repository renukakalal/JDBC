package com.xworkz.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.movie.dto.MovieDTO;
import com.xworkz.movie.repository.MovieRepoImp;

@WebServlet(urlPatterns = "/MovieServlet", loadOnStartup = 1)
public class MovieServlet extends HttpServlet {

	public MovieServlet() {
		super();

		System.out.println("servlet is running");

	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String id = req.getParameter("id");
		int convertedid = Integer.valueOf(id);
		String moviename = req.getParameter("MovieName");
		String theatrenmae = req.getParameter("theatreName");
		String price = req.getParameter("ticketPrice");
		double convertedprice = Double.valueOf(price);
		String noodTicket = req.getParameter("NoOfTickets");
		int convertednoOfTicket = Integer.valueOf(noodTicket);

		MovieDTO movieDTO = new MovieDTO(convertedid, moviename, theatrenmae, convertedprice, convertednoOfTicket);

		MovieRepoImp movieRepository = new MovieRepoImp();
		movieRepository.save(movieDTO);

		System.out.println("this is" + convertedid);
		System.out.println("this is" + moviename);
		System.out.println("this is" + theatrenmae);
		System.out.println("this is" + convertedprice);
		System.out.println("this is" + convertednoOfTicket);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}

}
