package models;

public abstract class SpyImpl extends SoldierImpl{
	private String spyCodeNumber;
	
	public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
		super(id, firstName, lastName);
		this.spyCodeNumber = codeNumber;
	}

	public String getSpyCodeNumber() {
		return spyCodeNumber;
	}
}
