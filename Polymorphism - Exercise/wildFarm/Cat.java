package wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
	String breed;
	
	public Cat(String type, String name, Double weight,	String livingRegion, String breed) {
		super(type, name, weight, livingRegion);
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Meowwww");
	}

	@Override
	protected void checkFood(Food food) throws Exception {
		// Cats eat everything
	}
	
	@Override
	public String toString() {
		DecimalFormat weightFormat = new DecimalFormat("#.##");

		return String.format("%s[%s, %s, %s, %s, %d]", 
					this.getClass().getSimpleName(),
					this.animalName,
					this.breed,
					weightFormat.format(this.animalWeight),
					this.livingRegion,
					this.foodEaten);
	}
}
