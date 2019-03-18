package mordorsCrueltyPlan;

import java.util.Arrays;

public class Gandalf {
	private int foodpoints;
	public Gandalf() {
		this.foodpoints = 0;
	}
	
	public void eatFood(String food) {
		String[] possibleFoods = Arrays.stream(Food.values())
				.map(gh -> gh.name().toLowerCase())
				.toArray(String[]::new);
		
		if (Arrays.asList(possibleFoods).contains(food.toLowerCase())) {
			foodpoints += Food.valueOf(food.toLowerCase()).getValue();
		} else {
			foodpoints += Food.Else.getValue();
		}
	}
	
	public int getFoodPoints() {
		return this.foodpoints;
	}
	
	public String getMood() {
		int points = this.foodpoints;
		String mood;

		if (points < - 5) {
			mood = "Angry";
		} else if (points < 0) {
			mood = "Sad";
		} else if (points < 15) {
			mood = "Happy";
		} else {
			mood = "JavaScript";
		}
		
		return mood;
	}
}