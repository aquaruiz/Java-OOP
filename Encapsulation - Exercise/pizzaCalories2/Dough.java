package pizzaCalories2;

public class Dough {
	private FlourType flourType;
	private BakingTechnique bakingTechnique;
	private double weight;
	
	public Dough(String flourType, String bakingTechnique, double weight) throws Exception {
		this.setFlourType(flourType);
		this.setBakingTechnique(bakingTechnique);
		this.setWeight(weight);
	}
	
	public void setFlourType(String flourType) throws Exception {
		try {
			FlourType currentFlourType = FlourType.valueOf(flourType);
			this.flourType = currentFlourType;
		} catch (Exception e) {
			throw new Exception("Invalid type of dough.");
		}
	}
	
	public void setBakingTechnique(String bakingTechnique) throws Exception {
		try {
			BakingTechnique currentBakingTechnique = BakingTechnique.valueOf(bakingTechnique);
			this.bakingTechnique = currentBakingTechnique;
		} catch (Exception e) {
			throw new Exception("Invalid type of dough.");
		}
	}

	public void setWeight(double weight) throws Exception {	
		if (weight < 0 || weight > 200) {
			throw new Exception("Dough weight should be in the range [1..200].");
		}
		
		this.weight = weight;
	}
	
	public double calculateCalories() {
		double totalCals = 2;
		totalCals *= this.weight;
		totalCals *= this.flourType.getValue();
		totalCals *= this.bakingTechnique.getValue();
		
		return totalCals;
	}
}