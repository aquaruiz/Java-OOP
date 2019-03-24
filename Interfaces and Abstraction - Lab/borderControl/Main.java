package borderControl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		List<Identifiable> rebels = new LinkedList<>();
		
		while(!line.equals("End")) {
			String[] tokens = line.split(" ");
			int tokensLength = tokens.length;
			
			switch (tokensLength) {
			case 3:
				String id = tokens[2];
				String name = tokens[0];
				int age = Integer.parseInt(tokens[1]);
				Citizen currentCitizen = new Citizen(name, age, id);
				rebels.add(currentCitizen);
				break;
			case 2:
				String model = tokens[0];
				id = tokens[1];
				Robot currentRobot = new Robot(id, model);
				rebels.add(currentRobot);
				break;
			default:
				break;
			}
			
			line = scanner.nextLine();
		}

		String needle = scanner.nextLine();
		scanner.close();
		
		for (Identifiable identifyImpl : rebels) {
			if (identifyImpl.getId().endsWith(needle)) {
				System.out.println(identifyImpl.getId());
			}
		}
	}
}