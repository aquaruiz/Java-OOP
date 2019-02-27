package hotelReservation;

public class PriceCalculator {
	private double pricePerDay;
	private int numberOfDays;
	private int season;
	private double discount;
	
	public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discount) {
		this.pricePerDay = pricePerDay;
		this.numberOfDays = numberOfDays;
		this.season = season.getValue();
		this.discount = discount.getValue();
	}

	public double calcPrice() {
		return pricePerDay * numberOfDays * (1 - discount) * season;
	}
}
