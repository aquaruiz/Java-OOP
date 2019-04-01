package pr01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		while(!line.equals("HARVEST")) {
			Field[] allFields = RichSoilLand.class.getDeclaredFields();
			List<Field> filteredFields = new LinkedList<>();
			
			switch (line) {
			case "private":
				for (Field field : allFields) {
					if (Modifier.isPrivate(field.getModifiers())) {
						filteredFields.add(field);
					}
				}
				break;
			case "protected":
				for (Field field : allFields) {
					if (Modifier.isProtected(field.getModifiers())) {
						filteredFields.add(field);
					}
				}
				break;
			case "public":
				for (Field field : allFields) {
					if (Modifier.isPublic(field.getModifiers())) {
						filteredFields.add(field);
					}
				}
				break;
			case "all":
				filteredFields.addAll(Arrays.asList(allFields));
				break;

			default:
				break;
			}
			
			for (Field field : filteredFields) {
				System.out.println(String.format("%s %s %s", 
						Modifier.toString(field.getModifiers()),
						field.getType().getSimpleName(),
						field.getName()));
			}
					
			line = scanner.nextLine();
		}
		
		scanner.close();
	}
}
