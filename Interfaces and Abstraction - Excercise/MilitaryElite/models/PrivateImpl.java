package models;

import interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
	private double salary;
	
	public PrivateImpl(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}
