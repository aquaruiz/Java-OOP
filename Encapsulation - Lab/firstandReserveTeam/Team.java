package firstandReserveTeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Team {
	private String name;
	private List<Person> firstTeam;
	private List<Person> reserveTeam;
	
	public Team(String name) {
		setName(name);
		this.firstTeam = new LinkedList<>();
		this.reserveTeam = new LinkedList<>();
	}

	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private List<Person> getFirstTeamPlayers() {
		return this.firstTeam;
	}
	
	private List<Person> getReserveTeamPlayers() {
		return this.reserveTeam;
	}
	
	public void addPlayer(Person player) {
		if (player.getAge() < 40) {
			this.firstTeam.add(player);
		} else {
			reserveTeam.add(player);
		}
	}
	
	public List<Person> getFirstTeam() {
		return Collections.unmodifiableList(this.firstTeam);
	}
	
	public List<Person> getReserveTeam() {
		return Collections.unmodifiableList(this.reserveTeam);
	}
}
