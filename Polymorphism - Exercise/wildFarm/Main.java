package wildFarm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		List<Animal> animals = new LinkedList<>();
		
		while (!line.equals("End")) {
			String[] tokens = line.split(" ");
			String[] foodTokens = scanner.nextLine().split(" ");
			String foodType = foodTokens[0];
			Food myFood = null;
			
			switch (foodType) {
			case "Vegetable":
				myFood = new Vegetable(Integer.parseInt(foodTokens[1]));
				break;
			case "Meat":
				myFood = new Meat(Integer.parseInt(foodTokens[1]));
				break;
			default:
				break;
			}
			String objType = tokens[0];
			
			switch (objType) {
			case "Cat":
				String name = tokens[1];
				Double weight = Double.parseDouble(tokens[2]);
				String livingRegion = tokens[3];
				String breed = tokens[4];
				Cat myCat = new Cat(objType, name, weight, livingRegion, breed);
				myCat.makeSound();
				try {
					myCat.eat(myFood);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				animals.add(myCat);
				break;
			case "Tiger":
				name = tokens[1];
				weight = Double.parseDouble(tokens[2]);
				livingRegion = tokens[3];
				Tiger myTiger = new Tiger(objType, name, weight, livingRegion);
				myTiger.makeSound();
				try {
					myTiger.eat(myFood);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				animals.add(myTiger);
				break;
			case "Zebra":
				name = tokens[1];
				weight = Double.parseDouble(tokens[2]);
				livingRegion = tokens[3];
				Zebra myZebra = new Zebra(objType, name, weight, livingRegion);
				myZebra.makeSound();
				try {
					myZebra.eat(myFood);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				animals.add(myZebra);
				break;
			case "Mouse":
				name = tokens[1];
				weight = Double.parseDouble(tokens[2]);
				livingRegion = tokens[3];
				Mouse myMouse = new Mouse(objType, name, weight, livingRegion);
				myMouse.makeSound();
				try {
					myMouse.eat(myFood);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				animals.add(myMouse);
				break;
			default:
				break;
			}
			
			line = scanner.nextLine();
		}
		
		scanner.close();
		animals.forEach(System.out::println);
	}
}