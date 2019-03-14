//package pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String name;
	private Dough dough;
	// ArrayList  ??
	private List<Topping> toppings;
	
	public Pizza(String name, int toppingsCount) throws Exception {
		this.setName(name);
		this.setToppings(toppingsCount);
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) throws Exception {
		if (name == null 
				|| name.trim().isEmpty()
				|| name.length() < 1
				|| name.length() > 15) {
			throw new Exception("Pizza name should be between 1 and 15 symbols.");
		}
		
		this.name = name;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}
	
	public void setToppings(int toppingsCount) throws Exception {
		if (toppingsCount < 0
				|| toppingsCount > 10) {
			throw new Exception("Number of toppings should be in range [0..10].");
		}
		
		this.toppings = new ArrayList<Topping>(toppingsCount);
	}
	
	public void addTopping(Topping topping) {
		this.toppings.add(topping);
	}
	
	public double getOverallCalories() {
		double totalCals = 0;
		
		// Add dough cals
		totalCals += this.dough.calculateCalories();
		
		// Add toppings cals
		for (Topping topping : toppings) {
			totalCals += topping.calculateCalories();
		}
		
		return totalCals;
	}
}