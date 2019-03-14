//package pizzaCalories;

public class Topping {
	private ToppingType toppingType;
	private double weight;
	
	public Topping(String toppingType, double weight) throws Exception {
		this.setToppingType(toppingType);
		this.setWeight(weight, toppingType);
	}
	
	public void setToppingType(String toppingType) throws Exception {
		try {
			ToppingType currentToppingType = ToppingType.valueOf(toppingType);
			this.toppingType = currentToppingType;
		} catch (Exception e) {
			throw new Exception(String.format("Cannot place %s on top of your pizza.", toppingType));
		}
	}
	
	public void setWeight(double weight, String toppingType) throws Exception {
		if (weight < 1 || weight > 50) {
			throw new Exception(String.format("%s weight should be in the range [1..50].", toppingType));
		}
		
		this.weight = weight;
	}
	
	public double calculateCalories() {
		double totalCals = 2;
		totalCals *= this.weight;
		totalCals *= this.toppingType.getValue();
		
		return totalCals;
	}
}