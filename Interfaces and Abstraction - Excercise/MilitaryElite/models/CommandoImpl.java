package models;

import java.util.LinkedList;
import java.util.List;

public abstract class CommandoImpl extends SpecialisedSoldier{
	private List<Mission> missions;
	
	public CommandoImpl(int id, String firstName, String lastName, double salary, Corp corpType) {
		super(id, firstName, lastName, salary, corpType);
		this.missions = new LinkedList<>();
	}
	
	public List<Mission> getMissions() {
		return missions;
	}
	
	public void addMission(Mission mission) {
		this.missions.add(mission);
	}
}
