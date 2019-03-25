package vehiclesExtension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Car myCar = null;
		Bus myBus = null;
		Truck myTruck = null;
		
		for (int i = 0; i < 3; i++) {
			String[] input = scanner.nextLine().split(" ");
			String obj = input[0];
			
			double fuel = Double.parseDouble(input[1]);
			double liters = Double.parseDouble(input[2]);
			double capacity = Double.parseDouble(input[3]);
			
			switch (obj) {
				case "Car":
					myCar = new Car(fuel, liters, capacity);
					break;
				case "Truck":
					myTruck = new Truck(fuel, liters, capacity);
					break;
				case "Bus":
					myBus = new Bus(fuel, liters, capacity);
					break;
				default:
					break;
			}
		}
			
		int n = Integer.parseInt(scanner.nextLine());
		
		DecimalFormat distanceFormat = new DecimalFormat("#.##");

		for (int j = 0; j < n; j++) {
			String[] tokens = scanner.nextLine().split(" ");
			String command = tokens[0];
			String objType = tokens[1];
			
			if (command.equals("Drive")) {
				double distance = Double.parseDouble(tokens[2]);
				
				switch (objType) {
					case "Car":
						try {
							myCar.drive(distance);
							System.out.println(String.format("%s travelled %s km",
											objType,
											distanceFormat.format(distance)));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					case "Truck":
						try {
							myTruck.drive(distance);
							System.out.println(String.format("%s travelled %s km",
									objType,
									distanceFormat.format(distance)));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					case "Bus":
						try {
							myBus.drive(distance, false);
							System.out.println(String.format("%s travelled %s km",
									objType,
									distanceFormat.format(distance)));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					default:
						break;					
				}
			} else if (command.equals("Refuel")) {
				double literRefuel = Double.parseDouble(tokens[2]);
				switch (objType) {
					case "Car":
						try {
							myCar.refuel(literRefuel);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					case "Truck":
						try {
							myTruck.refuel(literRefuel);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}							
						break;
					case "Bus":
						try {
							myBus.refuel(literRefuel);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}							
						break;
					default:
						break;
				}
			} else if (command.equals("DriveEmpty")) {
				double distance = Double.parseDouble(tokens[2]);
				try {
					myBus.drive(distance, true);

					System.out.println(String.format("%s travelled %d km",
									objType,
									distance));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} 
		}	
		
		scanner.close();
		
		System.out.println(myCar);
		System.out.println(myTruck);
		System.out.println(myBus);
	}
}