package models;

import interfaces.Missionable;

public class Mission implements Missionable{
	String codeName;
	State state;
	
	public Mission(String codeName, State state) {
		this.codeName = codeName;
		this.state = state;
	}

	@Override
	public void completeMission() {
		this.state = State.finished;
	}
	
	public String getCodeName() {
		return codeName;
	}
	
	public State getState() {
		return state;
	}
}
