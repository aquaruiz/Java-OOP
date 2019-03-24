import models.Corp;
import models.EngineerImpl;
import models.Repair;

public class Engineer extends EngineerImpl{

	public Engineer(int id, String firstName, String lastName, double salary, Corp corpType) {
		super(id, firstName, lastName, salary, corpType);
	}

	@Override
	public String toString() {
		String output = String.format("Name: %s %s Id: %d Salary: %.2f", 
				this.getFirstName(),
				this.getLastName(),
				this.getId(),
				this.getSalary());
		
		output += "\nCorps: " + this.getCorps().name();
		output += "\nRepairs:";
		
		for (Repair repair : this.getRepairs()) {
			output += String.format("%n  Part Name: %s Hours Worked: %d", 
					repair.getPartName(),
					repair.getHoursWorked());
		}
		
		return output;
	}
}
