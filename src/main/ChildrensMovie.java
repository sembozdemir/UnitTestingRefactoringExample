package main;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, Movie.CHILDRENS);
	}

	@Override
	public double amount(int dayRented) {
		double amount = 1.5;
		if (dayRented > 3)
			amount += (dayRented - 3) * 1.5;
		return amount;
	}
}
