import models.PrivateImpl;

public class Private extends PrivateImpl {

	public Private(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %d Salary: %.2f",
				this.getFirstName(),
				this.getLastName(),
				this.getId(),
				this.getSalary());
	}

}
