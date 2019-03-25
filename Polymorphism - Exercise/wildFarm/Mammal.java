package wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
	String livingRegion;

	public Mammal(String type, String name, Double weight,	String livingRegion) {
		super(type, name, weight);
		this.livingRegion = livingRegion;
	}
	
	@Override
	public String toString() {
		DecimalFormat weightFormat = new DecimalFormat("#.##");

		return String.format("%s[%s, %s, %s, %d]", 
					this.getClass().getSimpleName(),
					this.animalName,
					weightFormat.format(this.animalWeight),
					this.livingRegion,
					this.foodEaten);
	}
}