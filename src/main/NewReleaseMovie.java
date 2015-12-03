package main;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title, Movie.NEW_RELEASE);
	}

	@Override
	public double amount(int dayRented) {
		return dayRented * 3;
	}
}
