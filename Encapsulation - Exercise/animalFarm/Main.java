//package animalFarm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		
		try {
			Chicken myChicken = new Chicken(name, age);
//			myChicken.calculateProductPerDay();
			System.out.println(myChicken);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
