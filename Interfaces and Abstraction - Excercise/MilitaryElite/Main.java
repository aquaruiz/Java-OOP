import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import models.Corp;
import models.Mission;
import models.Repair;
import models.SoldierImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		List<SoldierImpl> soldiers = new LinkedList<>();
		Map<Integer, Private> privates = new HashMap<Integer, Private>();
		
		while(!line.equals("End")) {
			String[] tokens = line.split(" ");
			String objType = tokens[0];
			
			switch (objType) {
			case "Private":
				int id = Integer.parseInt(tokens[1]);
				String firstName = tokens[2];
				String lastName = tokens[3];
				double salary = Double.parseDouble(tokens[4]);
				Private currentPrivate = new Private(id, firstName, lastName, salary);
				soldiers.add(currentPrivate);
				privates.put(id, currentPrivate);
				break;
			case "LeutenantGeneral":
				id = Integer.parseInt(tokens[1]);
				firstName = tokens[2];
				lastName = tokens[3];
				salary = Double.parseDouble(tokens[4]);
				LeutenantGeneral currentGeneral = new LeutenantGeneral(id, firstName, lastName, salary);
				
				for (int i = 5; i < tokens.length; i++) {
					int currentSoldierId = Integer.parseInt(tokens[i]);
					currentGeneral.addPrivate(privates.get(currentSoldierId));
				}
				
				soldiers.add(currentGeneral);
				break;
			case "Engineer":
				id = Integer.parseInt(tokens[1]);
				firstName = tokens[2];
				lastName = tokens[3];
				salary = Double.parseDouble(tokens[4]);
				Corp corp = Corp.valueOf(tokens[5]);
				
				Engineer currentEngineer = new Engineer(id, firstName, lastName, salary, corp);
				
				for (int i = 6; i < tokens.length; i++) {
					String partName = tokens[i];
					int hoursWorked = Integer.parseInt(tokens[++i]);
					Repair currentRepair = new Repair(partName, hoursWorked);
					currentEngineer.addRepairs(currentRepair);
				}
				
				soldiers.add(currentEngineer);
				break;
			case "Commando":
				id = Integer.parseInt(tokens[1]);
				firstName = tokens[2];
				lastName = tokens[3];
				salary = Double.parseDouble(tokens[4]);
				corp = Corp.valueOf(tokens[5]);
				
				Commando currentCommando = new Commando(id, firstName, lastName, salary, corp);
				
				for (int i = 6; i < tokens.length; i++) {
					String missionCodeName = tokens[i];
					models.State state = models.State.valueOf(tokens[++i]);
					Mission currentMission = new Mission(missionCodeName, state);
					currentCommando.addMission(currentMission);
				}
				
				soldiers.add(currentCommando);
				break;
			case "Spy":
				id = Integer.parseInt(tokens[1]);
				firstName = tokens[2];
				lastName = tokens[3];
				String codeNumber = tokens[4];
				
				Spy currentSpy = new Spy(id, firstName, lastName, codeNumber);
				soldiers.add(currentSpy);
				break;

			default:
				break;
			}
			
			line = scanner.nextLine();
		}

		scanner.close();
		
		for (SoldierImpl soldier : soldiers) {
			System.out.println(soldier);
		}
	}

}
