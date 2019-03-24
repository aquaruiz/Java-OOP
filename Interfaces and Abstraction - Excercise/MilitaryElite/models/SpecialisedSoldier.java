package models;

public abstract class SpecialisedSoldier extends PrivateImpl implements interfaces.SpecialisedSoldier{
	private Corp corps;
	
	public SpecialisedSoldier(int id, String firstName, String lastName, double salary, Corp corpType) {
		super(id, firstName, lastName, salary);
		this.corps = corpType;
	}

	public Corp getCorps() {
		return corps;
	}
}
