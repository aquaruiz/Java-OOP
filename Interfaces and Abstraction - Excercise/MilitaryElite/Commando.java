
import models.CommandoImpl;
import models.Corp;
import models.Mission;

public class Commando extends CommandoImpl{

	public Commando(int id, String firstName, String lastName, double salary, Corp corpType) {
		super(id, firstName, lastName, salary, corpType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String output = String.format("Name: %s %s Id: %d Salary: %.2f", 
				this.getFirstName(),
				this.getLastName(),
				this.getId(),
				this.getSalary());
		
		output += "\nCorps: " + this.getCorps().name();
		output += "\nMissions: ";
		
		for (Mission mission : this.getMissions()) {
			if (!mission.getState().name().equals("finished")) {
				output += String.format("%n  Code Name: %s State: %s", 
						mission.getCodeName(),
						mission.getState().name());
			}
		}
		
		return output;
	}
}
