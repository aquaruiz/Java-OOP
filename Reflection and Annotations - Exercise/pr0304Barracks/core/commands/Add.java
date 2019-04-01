package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

public class Add extends Command {
	@Inject
	private Repository repository;
	
	@Inject
	private UnitFactory unitFactory;

	public Add(String[] data) {
		super(data);
	}
	
	public Repository getRepository() {
		return repository;
	}
	
	public UnitFactory getUnitFactory() {
		return unitFactory;
	}
	
	@Override
	public String execute() {
		String unitType = this.getData()[1];
		Unit unit = this.getUnitFactory().createUnit(unitType);
		this.getRepository().addUnit(unit);
		return unitType + " added!";
	}

}
