package hotelReservation;

public enum Discount {
	VIP(20),
	SecondVisit(10),
	None(0);
	
	private int value;
	
	private Discount(int value) {
		this.value = value;
	}
	
	public double getValue() {
		return value / 100.0;
	}
}
