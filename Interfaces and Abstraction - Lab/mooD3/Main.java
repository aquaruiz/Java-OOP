package mooD3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" \\| ");
		scanner.close();
		
		String username = input[0];
		String characterType = input[1];
		
		switch (characterType) {
		case "Archangel":
			int mana = Integer.parseInt(input[2]);
			int level = Integer.parseInt(input[3]);
			Archangel currentArchangel = new Archangel(username, level, mana);
			System.out.println(currentArchangel);
			break;
		case "Demon":
			double points = Double.parseDouble(input[2]);
			level = Integer.parseInt(input[3]);
			Demon currentDemon = new Demon(username, level, points);
			System.out.println(currentDemon);
			break;
		default:
			break;
		}
	}
}