package pizzaCalories;

public enum BakingTechnique {
	Crispy(0.9),
	Chewy(1.1),
	Homemade(1.0);
	
	private double value;
	
	private BakingTechnique(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}
