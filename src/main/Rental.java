package main;

public class Rental {
	private Movie movie;
	private int dayRented;

	public Rental(Movie movie, int dayRented) {
		this.movie = movie;
		this.dayRented = dayRented;
	}	

	public Movie getMovie() {
		return movie;
	}

	public int getDayRented() {
		return dayRented;
	}

	public double amount() {
		return movie.amount(dayRented);
	}

	public int renterPoint() {
		int renterPoint = 1;
		if (movie.getType().equals(Movie.NEW_RELEASE) && dayRented > 1)
			renterPoint++;		
		return renterPoint;
	}
}
