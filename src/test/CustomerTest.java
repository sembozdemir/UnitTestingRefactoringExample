package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.Customer;
import main.Rental;

public class CustomerTest {

	@Test
	public void testTotalAmountForOneMovie() {
		// setup
		Customer customer = new Customer("Semih");
		Rental rental = TestUtils.createRentalRegular(1);
		customer.rent(rental);
		
		// execute
		double totalAmount = customer.totalAmount();
		
		// assert
		assertEquals(2, totalAmount, 0.1f);		
	}
	
	@Test
	public void testTotalAmountForManyMovies() {
		// setup
		Customer customer = new Customer("Semih");
		customer.rent(TestUtils.createRentalRegular(4)); // 5 TL
		customer.rent(TestUtils.createRentalNewRelease(1)); // 3 TL
		customer.rent(TestUtils.createRentalChildrens(5)); // 4,5 TL
		
		// execute
		double totalAmount = customer.totalAmount();
		
		// assert
		assertEquals(12.5, totalAmount, 0.1f);
	}
	
	@Test
	public void testRenterPoint() {
		// setup
		Customer customer = new Customer("Ali");
		customer.rent(TestUtils.createRentalRegular(2)); // 1 p
		customer.rent(TestUtils.createRentalChildrens(2)); // 1 p
		customer.rent(TestUtils.createRentalNewRelease(1)); // 1 p
		customer.rent(TestUtils.createRentalNewRelease(2)); // 2 p
		
		// execute
		int totalRenterPoint = customer.getRenterPoint();
		
		// assert
		assertEquals(5, totalRenterPoint);
	}
}
