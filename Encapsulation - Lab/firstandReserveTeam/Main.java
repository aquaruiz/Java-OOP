package firstandReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Team team = new Team("Minopr");

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			String[] input = reader.readLine().split(" ");
			String firstName = input[0];
			String lastName = input[1];
			int age = Integer.parseInt(input[2]);
			double salary = Double.parseDouble(input[3]);

//			try {
				Person nextPerson = new Person(firstName, lastName, age, salary);
				team.addPlayer(nextPerson);
				team.getFirstTeam().add(new Person(firstName, lastName, age, salary));
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
		}
		
		System.out.println("First team has " + team.getFirstTeam().size() + " players");
		System.out.println("Reserve team has " + team.getReserveTeam().size() + " players");
	}
}
