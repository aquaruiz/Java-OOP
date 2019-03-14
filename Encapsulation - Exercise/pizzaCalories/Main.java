//package pizzaCalories;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza myPizza;
		
		String[] pizzaTokens = scanner.nextLine().split(" ");
		String pizzaName = pizzaTokens[1];
		int pizzaToppingNum = Integer.parseInt(pizzaTokens[2]);
		
		String[] doughTokens = scanner.nextLine().split(" ");
		
		String flourType = doughTokens[1];
		String bakingTechnique = doughTokens[2];
		double doughWeight = Double.parseDouble(doughTokens[3]);
		try {
			myPizza = new Pizza(pizzaName, pizzaToppingNum);
			Dough myDough = new Dough(flourType, bakingTechnique, doughWeight);
			myPizza.setDough(myDough);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		for (int i = 0; i < pizzaToppingNum; i++) {
			String[] toppingTokens = scanner.nextLine().split(" ");
			String toppingName = toppingTokens[1];
			double toppingWeight = Double.parseDouble(toppingTokens[2]);
			
			try {
				Topping myNextTopping = new Topping(toppingName, toppingWeight);
				myPizza.addTopping(myNextTopping);
			} catch (Exception e) {
				System.out.println(e.getMessage());
//				i--;
//				continue;
				return;
			}
		}
		
		scanner.close();
		
		DecimalFormat caloriesFormat = new DecimalFormat("0.00");
		System.out.println(myPizza.getName() + " - " + caloriesFormat.format(myPizza.getOverallCalories()));
	}
}
