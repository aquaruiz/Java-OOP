package models;

import interfaces.Soldier;

public abstract class SoldierImpl implements Soldier{
	int id;
	String firstName;
	String lastName;
	
	public SoldierImpl(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
}
