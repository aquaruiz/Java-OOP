package mordorsCrueltyPlan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] foods = scanner.nextLine().split(" ");
		scanner.close();
		
		Gandalf myGandalf = new Gandalf();
		
		for (String food : foods) {
			myGandalf.eatFood(food);
		}
		
		System.out.println(myGandalf.getFoodPoints());
		System.out.println(myGandalf.getMood());
	}

}
