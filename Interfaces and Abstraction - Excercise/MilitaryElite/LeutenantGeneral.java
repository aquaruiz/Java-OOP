import models.LeutenantGeneralImpl;
import models.PrivateImpl;

public class LeutenantGeneral extends LeutenantGeneralImpl {

	public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
	}

	@Override
	public String toString() {
		String output = String.format("Name: %s %s Id: %d Salary: %.2f", 
				this.getFirstName(),
				this.getLastName(),
				this.getId(),
				this.getSalary());
		
		output += "\nPrivates:";
		
		if (this.getPrivates().size() > 0) {
			for (PrivateImpl pr: this.getPrivates()) {
				output += String.format("%n  Name: %s %s Id: %d Salary: %.2f",
						pr.getFirstName(),
						pr.getLastName(),
						pr.getId(),
						pr.getSalary());
			}
		}
		
		return output;
	}
}
