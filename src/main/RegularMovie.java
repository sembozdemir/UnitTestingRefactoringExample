package main;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, Movie.REGULAR);
	}

	@Override
	public double amount(int dayRented) {
		double amount = 2;
        if (dayRented > 2)
            amount += (dayRented - 2) * 1.5;
		return amount;
	}
}
