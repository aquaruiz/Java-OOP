package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;

public class Report extends Command{
	@Inject
	private Repository repository;
	
	protected Report(String[] data) {
		super(data);
	}

	public Repository getRepository() {
		return repository;
	}
	
	@Override
	public String execute() {
		return this.getRepository().getStatistics();
	}

}
