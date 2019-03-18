package animalFarm;

import java.text.DecimalFormat;

public class Chicken {
	private String name;
	private int age;
	
	public Chicken(String name, int age) throws Exception {
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception {
		if (name.equals(null) || name.trim().isEmpty()) {
			throw new Exception("Name cannot be empty.");
		}
		
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception {
		if (age < 0 || age > 15) {
			throw new Exception("Age should be between 0 and 15.");
		}
		
		this.age = age;
	}
	
	public double productPerDay() {
		double currentAge = this.age;
		double product = 0;
		
		if (currentAge < 6) {
			product = 2;
		} else if (currentAge < 12) {
			product = 1;
		} else {
			product = 0.75;
		}

		return product;
	}
	
	@SuppressWarnings("unused")
	private double calculateProductPerDay() {
		return this.productPerDay();

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		DecimalFormat eggsFormat = this.productPerDay() < 1 ? new DecimalFormat("0.00") : new DecimalFormat("0");
		return String.format("Chicken Mara (age %d) can produce %s eggs per day.",
				this.age,
				eggsFormat.format(this.productPerDay()));
	}
}