package randomArrayList;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		RandomArrayList<Integer> myList = new RandomArrayList<>();
		myList.add(5);
		myList.add(15);
		myList.add(25);
		myList.add(35);

		System.out.println(myList.stream().map(element -> element.toString()).collect(Collectors.joining(" ")));
		System.out.println(myList.getRandomElement());
		System.out.println(myList.stream().map(element -> element.toString()).collect(Collectors.joining(" ")));
	}

}
