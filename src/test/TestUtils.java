package test;

import main.ChildrensMovie;
import main.Movie;
import main.NewReleaseMovie;
import main.RegularMovie;
import main.Rental;

public class TestUtils {
	public static Movie createChildrensMovie() {
		return new ChildrensMovie("Toy Story");
	}

	public static Movie createNewReleaseMovie() {
		return new NewReleaseMovie("The Martian");
	}

	public static Movie createRegularMovie() {
		return new RegularMovie("Titanic");
	}

	public static Rental createRentalRegular(int dayRented) {
		return new Rental(createRegularMovie(), dayRented);
	}

	public static Rental createRentalNewRelease(int dayRented) {
		return new Rental(createNewReleaseMovie(), dayRented);
	}

	public static Rental createRentalChildrens(int dayRented) {
		return new Rental(createChildrensMovie(), dayRented);
	}

}
