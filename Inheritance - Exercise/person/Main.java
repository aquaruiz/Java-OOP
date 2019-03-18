package person;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

	    Scanner scanner = new Scanner(System.in);
	    String name = scanner.nextLine();
	    int age = Integer.valueOf(scanner.nextLine());

	    scanner.close();
	    
	    try {
	        Child child = new Child(name, age);
	        System.out.println(child.toString());
	      
	      @SuppressWarnings("unused")
	        String personClassName = Person.class.getSimpleName();
	        String childClassName = Child.class.getSimpleName();
	    } catch (IllegalArgumentException error) {
	        System.out.println(error.getMessage());
	    }
	}
}