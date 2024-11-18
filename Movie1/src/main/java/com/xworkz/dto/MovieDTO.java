package com.xworkz.dto;

public class MovieDTO {
	
	
	
private int Movieid;
	
	private String MovieName;
	private String theatreName;
	private double ticketPrice;
	private int NoOfTickets;
	
	public MovieDTO() {
		super();
	}

	public MovieDTO(int movieid, String movieName, String theatreName, double ticketPrice, int noOfTickets) {
		super();
		Movieid = movieid;
		MovieName = movieName;
		this.theatreName = theatreName;
		this.ticketPrice = ticketPrice;
		NoOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "MovieDTO [Movieid=" + Movieid + ", MovieName=" + MovieName + ", theatreName=" + theatreName
				+ ", ticketPrice=" + ticketPrice + ", NoOfTickets=" + NoOfTickets + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MovieName == null) ? 0 : MovieName.hashCode());
		result = prime * result + Movieid;
		result = prime * result + NoOfTickets;
		result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ticketPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MovieDTO))
			return false;
		MovieDTO other = (MovieDTO) obj;
		if (MovieName == null) {
			if (other.MovieName != null)
				return false;
		} else if (!MovieName.equals(other.MovieName))
			return false;
		if (Movieid != other.Movieid)
			return false;
		if (NoOfTickets != other.NoOfTickets)
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
			return false;
		return true;
	}

	public int getMovieid() {
		return Movieid;
	}

	public void setMovieid(int movieid) {
		Movieid = movieid;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfTickets() {
		return NoOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		NoOfTickets = noOfTickets;
	}
	
	

}
