//package pizzaCalories;

public class Dough {
	private String flourType;
	private String bakingTechnique;
	private double weight;
	
	public Dough(String flourType, String bakingTechnique, double weight) throws Exception {
		this.setFlourType(flourType);
		this.setBakingTechnique(bakingTechnique);
		this.setWeight(weight);
	}
	
	public void setFlourType(String flourType) throws Exception {
		if (!flourType.equals("White")
				&& !flourType.equals("Wholegrain")) {
			throw new Exception("Invalid type of dough.");
		}
		
		this.flourType = flourType;
	}
	
	public void setBakingTechnique(String bakingTechnique) throws Exception {
		if (!bakingTechnique.equals("Crispy")
				&& !bakingTechnique.equals("Chewy")
				&& !bakingTechnique.equals("Homemade")) {
			throw new Exception("Invalid type of dough.");
		}
		
		this.bakingTechnique = bakingTechnique;
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
		
		switch (this.flourType) {
		case "White":
			totalCals *= 1.5;
			break;
		case "Wholegrain":
			totalCals *= 1.0;
			break;
		}
		
		switch (this.bakingTechnique) {
		case "Crispy":
			totalCals *= 0.9;
			break;
		case "Chewy":
			totalCals *= 1.1;
			break;
		case "Homemade":
			totalCals *= 1.0;
			break;
		}
		
		return totalCals;
	}
}