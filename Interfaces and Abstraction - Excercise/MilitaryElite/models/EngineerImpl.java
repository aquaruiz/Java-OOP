package models;

import java.util.LinkedList;
import java.util.List;

public abstract class EngineerImpl extends SpecialisedSoldier{
	private List<Repair> repairs;
	
	public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corpType) {
		super(id, firstName, lastName, salary, corpType);
		this.repairs = new LinkedList<>();
	}

	public List<Repair> getRepairs() {
		return repairs;
	}
	
	public void addRepairs(Repair repair) {
		this.repairs.add(repair);
	}
}