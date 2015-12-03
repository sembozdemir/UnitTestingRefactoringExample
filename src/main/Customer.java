package main;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Rental> rentals;
	private int renterPoint;

	public Customer(String name) {
		this.name = name;
		renterPoint = 0;
		rentals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Rental> getRentals() {
		return rentals;
	}

	public int getRenterPoint() {
		return renterPoint;
	}

	public void rent(Rental rental) {
		rentals.add(rental);
		renterPoint += rental.renterPoint();
	}

	public double totalAmount() {
		double totalAmount = 0;
		for (Rental rental : rentals) {
			totalAmount += rental.amount();
		}
		return totalAmount;
	}
}
