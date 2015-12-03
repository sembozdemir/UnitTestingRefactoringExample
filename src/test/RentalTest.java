package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Movie;
import main.Rental;

public class RentalTest {

	@Test
	public void testAmountForOneDay() {
		// setup
		Movie movie1 = TestUtils.createRegularMovie();
		Rental rental1 = new Rental(movie1, 1);
		
		Movie movie2 = TestUtils.createNewReleaseMovie();
		Rental rental2 = new Rental(movie2, 1);
		
		Movie movie3 = TestUtils.createChildrensMovie();
		Rental rental3 = new Rental(movie3, 1);
		
		// execute
		double result1 = rental1.amount();
		double result2 = rental2.amount();
		double result3 = rental3.amount();
		
		// assert
		assertEquals(2, result1, 0.1f);
		assertEquals(3, result2, 0.1f);
		assertEquals(1.5, result3, 0.1f);
	}
	
	@Test
	public void testAmountForManyDays() {
		// setup
		Rental rental2 = new Rental(TestUtils.createRegularMovie(), 2); // 2 TL
		Rental rental3_5 = new Rental(TestUtils.createRegularMovie(), 3); // 3,5 TL
		Rental rental5 = new Rental(TestUtils.createRegularMovie(), 4); // 5 TL
		Rental rental6 = new Rental(TestUtils.createNewReleaseMovie(), 2); // 6 TL
		Rental rental1_5 = new Rental(TestUtils.createChildrensMovie(), 3); // 1,5 TL
		Rental rental3 = new Rental(TestUtils.createChildrensMovie(), 4); // 3 TL
		Rental rental4_5 = new Rental(TestUtils.createChildrensMovie(), 5); // 4,5 TL
		
		// execute
		double result2 = rental2.amount();
		double result3_5 = rental3_5.amount();
		double result5 = rental5.amount();
		double result6 = rental6.amount();
		double result1_5 = rental1_5.amount();
		double result3 = rental3.amount();
		double result4_5 = rental4_5.amount();
		
		// assert
		assertRental(2, result2);
		assertRental(3.5, result3_5);
		assertRental(5, result5);
		assertRental(6, result6);
		assertRental(1.5, result1_5);
		assertRental(3, result3);
		assertRental(4.5, result4_5);
	}

	private void assertRental(double expected, double actual) {
		assertEquals(expected, actual, 0.1f);
	}
	
	@Test
	public void testRenterPoint() {
		// setup
		Rental rentalRegular1day = new Rental(TestUtils.createRegularMovie(), 1); // 1 p
		Rental rentalRegular2days = new Rental(TestUtils.createRegularMovie(), 2); // 1 p
		Rental rentalChildrens1day = new Rental(TestUtils.createChildrensMovie(), 1); // 1 p
		Rental rentalChildrens2days = new Rental(TestUtils.createChildrensMovie(), 2); // 1 p
		Rental rentalNewRelease1day = new Rental(TestUtils.createNewReleaseMovie(), 1); // 1 p
		Rental rentalNewRelease2days = new Rental(TestUtils.createNewReleaseMovie(), 2); // 2 p
		Rental rentalNewRelease3days = new Rental(TestUtils.createNewReleaseMovie(), 3); // 2 p
		
		// execute
		int result1p = rentalRegular1day.renterPoint();
		int result1p2 = rentalRegular2days.renterPoint();
		int result1p3 = rentalChildrens1day.renterPoint();
		int result1p4 = rentalChildrens2days.renterPoint();
		int result1p5 = rentalNewRelease1day.renterPoint();
		int result2p = rentalNewRelease2days.renterPoint();
		int result2p2 = rentalNewRelease3days.renterPoint();
		
		// assert
		assertEquals(result1p, 1);
		assertEquals(result1p2, 1);
		assertEquals(result1p3, 1);
		assertEquals(result1p4, 1);
		assertEquals(result1p5, 1);
		assertEquals(result2p, 2);
		assertEquals(result2p2, 2);
	}

}
