package pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] inputs = Arrays.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		int topLeftX = inputs[0];
		int topLeftY = inputs[1];
		int bottomRightX = inputs[2];
		int bottomRightY = inputs[3];
		
		Point topLeft = new Point(topLeftX, topLeftY);
		Point bottomRight = new Point(bottomRightX, bottomRightY);
		Rectangle myRectangle = new Rectangle(topLeft, bottomRight);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			int[] coords = Arrays.stream(scanner.nextLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			Point currentPoint = new Point(coords[0], coords[1]);
			System.out.println(myRectangle.contain(currentPoint));
		}
		
		scanner.close();
	}

}
