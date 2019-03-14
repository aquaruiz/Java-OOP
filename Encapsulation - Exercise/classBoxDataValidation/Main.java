//package classBoxDataValidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double length = Double.parseDouble(scanner.nextLine());
		double width = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		
		try {
			Box myBox = new Box(length, width, height);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
