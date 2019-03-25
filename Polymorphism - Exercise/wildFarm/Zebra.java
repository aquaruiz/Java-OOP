package wildFarm;

public class Zebra extends Mammal{
	public Zebra(String type, String name, Double weight, String livingRegion) {
		super(type, name, weight, livingRegion);
	}

	@Override
	public void makeSound() {
		System.out.println("Zs");
	}

	@Override
	protected void checkFood(Food food) throws Exception {
		if (!food.getClass().getSimpleName().equals("Vegetable")) {
			throw new Exception(this.getClass().getSimpleName() + "s are not eating that type of food!");
		}
	}
}
