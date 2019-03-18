package classBox;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double length = Double.parseDouble(scanner.nextLine());
		double width = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		
		scanner.close();
		
		Box myBox = new Box(length, width, height);
		
		DecimalFormat doubleFormat = new DecimalFormat("0.00");
		
		System.out.println("Surface Area - " + doubleFormat.format(myBox.calculateSurfaceArea()));
		System.out.println("Lateral Surface Area - " + doubleFormat.format(myBox.calculateLateralSurfaceArea()));
		System.out.println("Volume – " + doubleFormat.format(myBox.calculateVolume()));
	}
}
