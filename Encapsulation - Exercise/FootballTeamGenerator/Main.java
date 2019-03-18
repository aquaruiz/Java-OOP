package FootballTeamGenerator;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Team> teams = new HashMap<>();
		String line = scanner.nextLine();

		while (!line.equals("END")){
			String[] tokens = line.split(";");
			String command = tokens[0];
			
			switch (command) {
			case "Team":
				String teamName = tokens[1];
				try {
					Team newTeam = new Team(teamName);
					teams.put(teamName, newTeam);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "Add":
				teamName = tokens[1];
				if (!teams.containsKey(teamName)) {
					System.out.println(String.format("Team %s does not exist.", teamName));
					break;
				}
				
				String playerName = tokens[2];
				int endurance = Integer.parseInt(tokens[3]);
				int sprint = Integer.parseInt(tokens[4]);
				int dribble = Integer.parseInt(tokens[5]);
				int passing = Integer.parseInt(tokens[6]);
				int shooting = Integer.parseInt(tokens[7]);
				Player currentPlayer;
				
				try {
					currentPlayer = new Player(playerName, endurance, sprint, dribble, passing, shooting);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				
				teams.get(teamName).addPlayer(currentPlayer);;
				break;
			case "Remove":
				teamName = tokens[1];
				if (!teams.containsKey(teamName)) {
					System.out.println(String.format("Team %s does not exist.", teamName));
					break;
				}
				
				playerName = tokens[2];
				
				try {
					teams.get(teamName).removePlayer(playerName);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "Rating":
				teamName = tokens[1];
				if (!teams.containsKey(teamName)) {
					System.out.println(String.format("Team %s does not exist.", teamName));
					break;
				}
				
				DecimalFormat ratingFormat = new DecimalFormat("0");
				
				double rating = teams.get(teamName).getRating();
				System.out.println(teamName + " - " + ratingFormat.format(rating));
				break;
			}

			line = scanner.nextLine();
		}
		
		scanner.close();
	}
}