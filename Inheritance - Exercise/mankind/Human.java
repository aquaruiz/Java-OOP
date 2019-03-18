package mankind;

public abstract class Human {
	private String firstName;
	private String lastName;
	
	public Human(String firstName, String lastName) throws Exception {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	private void setFirstName(String firstName) throws Exception {
		if (!Character.isUpperCase(firstName.charAt(0))) {
			throw new Exception("Expected upper case letter!Argument: firstName");
		}
		
		if (firstName.length() < 4) {
			throw new Exception("Expected length at least 4 symbols!Argument: firstName");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	protected void setLastName(String lastName) throws Exception {
		if (!Character.isUpperCase(lastName.charAt(0))) {
			throw new Exception("Expected upper case letter!Argument: lastName");
		}
		
		if (lastName.length() < 3) {
			throw new Exception("Expected length at least 3 symbols!Argument: lastName");
		}
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("First Name: %s%nLast Name: %s",
				this.firstName,
				this.lastName);
	}
}