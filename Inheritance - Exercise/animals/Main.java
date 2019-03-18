package animals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.equals("Beast!")) {
			String type = line;
			String[] tokens = scanner.nextLine().split(" ");
			String name = tokens[0];
			int age = Integer.parseInt(tokens[1]);
			String gender = null; 
			
			if (!type.equals("Kitten")
					&& !type.equals("Tomcat")) {
				gender = tokens[2];
			}
			
			try {
				switch (type) {
				case "Cat":
					Cat myCat = new Cat(name, age, gender);
					System.out.println(myCat);
					break;
				case "Dog":
					Dog myDog = new Dog(name, age, gender);
					System.out.println(myDog);
					break;
				case "Frog":
					Frog myFrog = new Frog(name, age, gender);
					System.out.println(myFrog);
					break;
				case "Kitten":
					Kitten myKitten = new Kitten(name, age);
					System.out.println(myKitten);
					break;
				case "Tomcat":
					Tomcat myTomcat = new Tomcat(name, age);
					System.out.println(myTomcat);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			line = scanner.nextLine();
		}
		
		scanner.close();
	}
}