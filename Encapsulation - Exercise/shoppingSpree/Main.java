//package shoppingSpree;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Person> people = new LinkedHashMap<>();
		Map<String, Product> products = new LinkedHashMap<>();
		
		String[] tokens1 = scanner.nextLine().split(";");
		
		for (String str : tokens1) {
			String[] tokens = str.split("=");
			String name = tokens[0];
			double money = Double.parseDouble(tokens[1]);
			
			try {
				Person currentPerson = new Person(name, money);
				people.putIfAbsent(name, currentPerson);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		String[] tokens2 = scanner.nextLine().split(";");
		
		for (String str : tokens2) {
			String[] tokens = str.split("=");
			String name = tokens[0];
			double cost = Double.parseDouble(tokens[1]);
			
			try {
				Product currentProduct = new Product(name, cost);
				products.putIfAbsent(name, currentProduct);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		String input = scanner.nextLine();
		while (!input.equals("END")) {
			String[] tokens = input.split(" ");
			String personName = tokens[0];
			String productName = tokens[1];
			
			if (people.containsKey(personName)) {
				try {
					people.get(personName).buyProduct(products.get(productName));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			input = scanner.nextLine();
		}

		scanner.close();
		for (String personName : people.keySet()) {
			System.out.println(people.get(personName));
		}
	}
}
