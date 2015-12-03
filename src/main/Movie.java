package main;

public abstract class Movie {
	public static final String REGULAR = "regular";
	public static final String NEW_RELEASE = "new release";
	public static final String CHILDRENS = "childrens";
	
	private String title;
	private String type;

	public Movie(String title, String type) {
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}
	
	public abstract double amount(int dayRented);
}
