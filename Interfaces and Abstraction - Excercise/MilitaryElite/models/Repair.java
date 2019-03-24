package models;

public class Repair {
	String partName;
	int hoursWorked;
	
	public Repair(String partName, int hoursWorked) {
		this.partName = partName;
		this.hoursWorked = hoursWorked;
	}
	
	public String getPartName() {
		return partName;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
}
