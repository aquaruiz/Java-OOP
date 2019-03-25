package wildFarm;

public class Tiger  extends Felime{
	String livingRegion;
	
	public Tiger(String type, String name, Double weight, String livingRegion) {
		super(type, name, weight, livingRegion);
	}

	@Override
	public void makeSound() {
		System.out.println("ROAAR!!!");
	}

	@Override
	protected void checkFood(Food food) throws Exception {
		if (!food.getClass().getSimpleName().equals("Meat")) {
			throw new Exception(this.getClass().getSimpleName() + "s are not eating that type of food!");
		}
	}
}
