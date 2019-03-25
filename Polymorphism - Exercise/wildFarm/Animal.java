package wildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
	String animalName;
	String animalType;
	Double animalWeight;
	Integer foodEaten;
	
	public Animal(String type, String name, Double weight) {
		this.animalType = type;
		this.animalName = name;
		this.animalWeight = weight;
		foodEaten = 0;
	}
	
	public Integer getFoodEaten() {
		return foodEaten;
	}
	
	public abstract void makeSound();
	
	public void eat(Food food) throws Exception {
		checkFood(food);
		this.foodEaten += food.getQuantity();
	}

	protected abstract void checkFood(Food food) throws Exception;
	
	@Override
	public String toString() {
		DecimalFormat weightFormat = new DecimalFormat("#.##");
		return String.format("%s[%s, %s, %d]", 
					this.getClass().getSimpleName(),
					this.animalName,
					weightFormat.format(this.animalWeight),
					this.foodEaten);
	}
}