package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;

public class Retire extends Command {
	@Inject
	private Repository repository;
	
	protected Retire(String[] data) {
		super(data);
	}

	public Repository getRepository() {
		return repository;
	}
	
	@Override
	public String execute() {
		try {
			String unitType = this.getData()[1];
			this.getRepository().removeUnit(unitType);
			return unitType + " retired!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}	
}