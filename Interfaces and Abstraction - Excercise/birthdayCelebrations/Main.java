package birthdayCelebrations;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		List<Birthable> myObj = new LinkedList<>();
		List<Robot> myRobots = new LinkedList<>();
		
		while (!line.equals("End")) {
			String[] tokens = line.split(" ");
			String objName = tokens[0];
			
			switch (objName) {
			case "Citizen":
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]);
				String id = tokens[3];
				String birthDate = tokens[4];
				
				Citizen currentCitizen = new Citizen(name, age, id, birthDate);
				myObj.add(currentCitizen);
				break;
			case "Pet":
				name = tokens[1];
				birthDate = tokens[2];
				
				Pet currentPet = new Pet(name, birthDate);
				myObj.add(currentPet);
				break;
			case "Robot":
				String model = tokens[1];
				id = tokens[2];
				Robot currentRobot = new Robot(id, model);
				myRobots.add(currentRobot);
				break;

			default:
				break;
			}
			
			line = scanner.nextLine();
		}
		
		String year = scanner.nextLine();
		scanner.close();
		
		for (Birthable obj : myObj) {
			if (obj.getBirthDate().contains(year)) {
				System.out.println(obj.getBirthDate());
			}
		}
	}

}
