

import models.SpyImpl;

public class Spy extends SpyImpl{

	public Spy(int id, String firstName, String lastName, String codeNumber) {
		super(id, firstName, lastName, codeNumber);
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %d%nCode Number: %s", 
				this.getFirstName(),
				this.getLastName(),
				this.getId(),
				this.getSpyCodeNumber());
	}

}
