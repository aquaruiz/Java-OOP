package mankind;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] studentTokens = scanner.nextLine().split(" ");
		String[] workerTokens = scanner.nextLine().split(" ");

		scanner.close();
		
		try {
			String firstName = studentTokens[0];
			String lastName = studentTokens[1];
			String facultyNumber = studentTokens[2];
			Student myStudent = new Student(firstName, lastName, facultyNumber);
			System.out.println(myStudent.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		try {
			String firstName = workerTokens[0];
			String lastName = workerTokens[1];
			double salary = Double.parseDouble(workerTokens[2]);
			double workingHours = Double.parseDouble(workerTokens[3]);
			
			Worker myWorker = new Worker(firstName, lastName, salary, workingHours);
			System.out.println(myWorker.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
