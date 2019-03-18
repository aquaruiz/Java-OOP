package pizzaCalories;

public class Topping {
	private String toppingType;
	private double weight;
	
	public Topping(String toppingType, double weight) throws Exception {
		this.setToppingType(toppingType);
		this.setWeight(weight);
	}
	
	public void setToppingType(String toppingType) throws Exception {
		if (!toppingType.equals("Meat")
				&& !toppingType.equals("Veggies")
				&& !toppingType.equals("Cheese")
				&& !toppingType.equals("Sauce")) {
	
			throw new Exception(String.format("Cannot place %s on top of your pizza.", toppingType));
		}
		
		this.toppingType = toppingType;
	}
	
	public void setWeight(double weight) throws Exception {
		if (weight < 1 || weight > 50) {
			throw new Exception(String.format("%s weight should be in the range [1..50].", this.toppingType));
		}
		
		this.weight = weight;
	}
	
	public double calculateCalories() {
		double totalCals = 2;
		totalCals *= this.weight;
		
		switch (this.toppingType) {
		case "Meat":
			totalCals *= 1.2;
			break;
		case "Veggies":
			totalCals *= 0.8;
			break;
		case "Cheese":
			totalCals *= 1.1;
			break;
		case "Sauce":
			totalCals *= 0.9;
			break;
		}
		
		return totalCals;
	}
}