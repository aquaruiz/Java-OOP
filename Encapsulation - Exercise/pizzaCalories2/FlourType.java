package pizzaCalories;

public enum FlourType {
	White(1.5),
	Wholegrain(1.0);
	
	private double value;
	
	private FlourType(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}
