package salaryIncrease;

import java.text.DecimalFormat;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Person(String firstName, String lastName, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; 
		this.salary = salary;
	}

	private String getFirstName() {
		return firstName;
	}
	
	private String getLastName() {
		return lastName;
	}
	
	private Integer getAge() {
		return age;
	}
	
	private double getSalary() {
		return salary;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double bonus) {
		if (this.getAge() < 30) {
			bonus /= 2;
		}
		
		double percent = 1 + bonus / 100;
		this.setSalary(this.getSalary() * percent);
	}
	
	@Override
	public String toString() {
		DecimalFormat salaryFormater = new DecimalFormat("#.0##########");
		return String.format("%s %s gets ", 
					this.getFirstName(),
					this.getLastName()) +
					salaryFormater.format(this.getSalary()) + " leva";
	}
}
