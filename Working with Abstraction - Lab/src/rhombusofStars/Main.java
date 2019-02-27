package rhombusofStars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		for (int i = 0; i < n - 1; i++) {
			printNewRow(n, i);
		}
		
//		System.out.println(constructStringFromString("* ", n));
		
		for (int i = n - 1; i >= 0; i--) {
			printNewRow(n, i);
		}
	}

	private static void printNewRow(int total, int current) {
		System.out.print(constructStringFromChar(' ', total - 1 - current));
		System.out.print(constructStringFromString("* ", current + 1));
		System.out.println();
	}

	public static String constructStringFromChar(char ch, int times) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < times; i++) {
			sb.append(ch);
		}

		return sb.toString();
	}

	public static String constructStringFromString(String str, int times) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < times; i++) {
			sb.append(str);
		}

		return sb.toString();
	}
}