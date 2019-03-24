//package telephony;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		LinkedList<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.collect(Collectors.toCollection(LinkedList::new));

		LinkedList<String> urls = Arrays.stream(scanner.nextLine().split(" "))
				.collect(Collectors.toCollection(LinkedList::new));
		scanner.close();
		
		Smartphone myPhone = new Smartphone(numbers, urls);
		System.out.println(myPhone.call());
		System.out.println(myPhone.browse());
	}

}
