//package foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Buyer> foodBuyers = new HashMap<>();
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] tokens = scanner.nextLine().split(" ");
			int objLength = tokens.length;
			
			switch (objLength) {
			case 4:
				String name = tokens[0];
				int age = Integer.parseInt(tokens[1]);
				String id = tokens[2];
				String birthDate = tokens[3];
				
				Citizen currentCitizen = new Citizen(name, age, id, birthDate);
				foodBuyers.put(name, currentCitizen);
				break;
			case 3:
				name = tokens[0];
				age = Integer.parseInt(tokens[1]);
				String group = tokens[2];
				Rebel currentRebel = new Rebel(name, age, group);
				foodBuyers.put(name, currentRebel);
				break;
			default:
				break;
			}
		}
		
		String line = scanner.nextLine();
		
		while(!line.equals("End")) {
			String currentName = line.split(" ")[0];
			
			if (foodBuyers.containsKey(currentName)) {
				foodBuyers.get(currentName).buyFood();
			}

			line = scanner.nextLine();
		}
		
		scanner.close();
		
		int totalFood = 0;
		
		for (Map.Entry<String, Buyer> kvp : foodBuyers.entrySet()) {
			totalFood += kvp.getValue().getFood();
		}
		
		System.out.println(totalFood);
	}

}
