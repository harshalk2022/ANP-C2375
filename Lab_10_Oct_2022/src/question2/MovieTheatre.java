package question2;

import java.time.LocalTime;

public class MovieTheatre {
	private String movieName;
	private LocalTime movieStartTime;
	private LocalTime movieEndTime;
	private float movieTicketPrice;
	
	public MovieTheatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MovieTheatre(String movieName, LocalTime movieStartTime, LocalTime movieEndTime, float movieTicketPrice) {
		super();
		this.movieName = movieName;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;
	}
	
	
	@Override
	public String toString() {
		return "MovieTheatre [movieName=" + movieName + ", movieStartTime=" + movieStartTime + ", movieEndTime="
				+ movieEndTime + ", movieTicketPrice=" + movieTicketPrice + "]";
	}
	
}
