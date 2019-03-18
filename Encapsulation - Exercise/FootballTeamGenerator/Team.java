package FootballTeamGenerator;

import java.util.LinkedList;
import java.util.List;

public class Team {
	String name;
	List<Player> players;
	
	public Team(String name) throws Exception {
		setName(name);
		this.players = new LinkedList<>();
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) throws Exception {
		if (name == null ||
				name.trim().isEmpty()){
			throw new Exception("A name should not be empty.");
		}
		
		this.name = name;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void removePlayer(String playerName) throws Exception {
		for (Player player : players) {
			if (player.getName().equals(playerName)) {
				this.players.remove(player);
				return;
			}
		}
		
		String format = String.format("Player %s is not in %s team. ",
				playerName,
				this.getName());
		
		throw new Exception(format);
	}
	
	public double getRating() {
		double totalStats = 0;
		int playerNum = this.players.size();

		if (playerNum == 0) {
			return totalStats;
		}
		
		for (Player player : players) {
			totalStats += player.overallSkillLevel();
		}
		
		
		return totalStats / playerNum;
	}
}