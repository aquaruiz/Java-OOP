import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] elements = scanner.nextLine().split(" ");
		
		AddCollection myAddCollection = new AddCollection();
		AddRemoveCollection myAddRemoveCollection = new AddRemoveCollection();
		MyListImpl myList = new MyListImpl();
		
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder sBuilder2 = new StringBuilder();
		StringBuilder sBuilder3 = new StringBuilder();
		
		for (String string : elements) {
			sBuilder.append(myAddCollection.add(string) + " ");
			sBuilder2.append(myAddRemoveCollection.add(string) + " ");
			sBuilder3.append(myList.add(string) + " ");
		}
		
		int times = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		StringBuilder sBuilder4 = new StringBuilder();
		StringBuilder sBuilder5 = new StringBuilder();
		
		for (int i = 0; i < times; i++) {
			sBuilder4.append(myAddRemoveCollection.remove() + " ");
			sBuilder5.append(myList.remove() + " ");
		}

		System.out.println(sBuilder.toString());
		System.out.println(sBuilder2.toString());
		System.out.println(sBuilder3.toString());
		System.out.println(sBuilder4.toString());
		System.out.println(sBuilder5.toString());
	}
}