package pr02PrivateClassFiddling;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.util.Scanner;

import pr02PrivateClassFiddling.com.BlackBoxInt;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Scanner scanner = new Scanner(System.in);
		
		@SuppressWarnings("unchecked")
		Constructor<BlackBoxInt> blackConstructor = (Constructor<BlackBoxInt>)BlackBoxInt.class
				.getDeclaredConstructors()[0];

		blackConstructor.setAccessible(true);
		BlackBoxInt myBlackBox = blackConstructor.newInstance(0);
		
		String line = scanner.nextLine();
		
		while(!line.equals("END")) {
			String[] tokens = line.split("_");
			String command = tokens[0];
			int val = Integer.parseInt(tokens[1]);
			
			Method current = BlackBoxInt.class.getDeclaredMethod(command, int.class);
			current.setAccessible(true);
			current.invoke(myBlackBox, val);
			
			Field myField = BlackBoxInt.class.getDeclaredField("innerValue");
			myField.setAccessible(true);
			
			System.out.println(myField.get(myBlackBox));

			line = scanner.nextLine();
		}
		
		scanner.close();
	}
}
