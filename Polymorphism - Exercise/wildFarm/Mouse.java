package wildFarm;

public class Mouse extends Mammal {
	public Mouse(String type, String name, Double weight, String livingRegion) {
		super(type, name, weight, livingRegion);
	}
	@Override
	public void makeSound() {
		System.out.println("SQUEEEAAAK!");
	}

	@Override
	protected void checkFood(Food food) throws Exception {
		if (!food.getClass().getSimpleName().equals("Vegetable")) {
			throw new Exception("Mice are not eating that type of food!");
		}
	}
}
