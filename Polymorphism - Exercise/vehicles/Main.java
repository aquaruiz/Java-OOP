package vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		String[] carInfo = scanner.nextLine().split(" ");
		
		double fuel = Double.parseDouble(carInfo[1]);
		double liters = Double.parseDouble(carInfo[2]);
		
		Car myCar = new Car(fuel, liters);

		String[] truckInfo = scanner.nextLine().split(" ");
		
		fuel = Double.parseDouble(truckInfo[1]);
		liters = Double.parseDouble(truckInfo[2]);
		
		Truck myTruck = new Truck(fuel, liters);
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] tokens = scanner.nextLine().split(" ");
			String command = tokens[0];
			String obj = tokens[1];
			
			switch (command) {
			case "Drive":
				double distance = Double.parseDouble(tokens[2]);
				try {
					if (obj.equals("Car")) {
						myCar.drive(distance);
					} else if(obj.equals("Truck")) {
						myTruck.drive(distance);
					}
					
					DecimalFormat distanceFormat = new DecimalFormat("#.##");
					
					System.out.println(String.format("%s travelled %s km",
									obj,
									distanceFormat.format(distance)));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "Refuel":
				double literRefuel = Double.parseDouble(tokens[2]);
				if (obj.equals("Car")) {
					myCar.refuel(literRefuel);
				} else if(obj.equals("Truck")) {
					myTruck.refuel(literRefuel);
				}
				break;
			default:
				break;
			}
		}
		
		scanner.close();
		System.out.println(myCar);
		System.out.println(myTruck);
	}

}
