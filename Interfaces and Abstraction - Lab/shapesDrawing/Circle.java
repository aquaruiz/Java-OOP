package shapesDrawing;

public class Circle implements Drawable{
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public void draw() {
		// first row
		for (int j = 0; j < getRadius() + 1; j++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < getRadius() * 2 - 1; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		int midSpacesCount = getRadius() * 2 - 1;
		
		// second row
		for (int j = 0; j < getRadius() + 1 - 3; j++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		
		for (int i = 0; i < midSpacesCount; i++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}

		for (int j = 0; j < getRadius() + 1 - 3; j++) {
			System.out.print(" ");
		}
		
		System.out.println();
		
		midSpacesCount += 2;
		int leftSpaceCount = getRadius() + 1 - 3;
		// rows 3 - radius
		for (int i = 0; i < getRadius() - 2; i++) {
			midSpacesCount += 2;
			leftSpaceCount -= 1;
			
			for (int j = 0; j < leftSpaceCount; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < midSpacesCount; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//middle count radius
		midSpacesCount += 2;
		leftSpaceCount -= 1;
		
		System.out.print("*");
		
		for (int j = 0; j < midSpacesCount - 1; j++) {
			System.out.print(" ");
		}
		
		System.out.print("*");
		
		System.out.println();

		for (int i = 0; i < getRadius() - 2; i++) {
			midSpacesCount -= 2;
			leftSpaceCount += 1;
			
			for (int j = 0; j < leftSpaceCount; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < midSpacesCount; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		midSpacesCount -= 4;

		// row before the last row
		for (int j = 0; j < getRadius() + 1 - 3; j++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		
		for (int i = 0; i < midSpacesCount; i++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}

		for (int j = 0; j < getRadius() + 1 - 3; j++) {
			System.out.print(" ");
		}
		
		System.out.println();

		//last row
		for (int j = 0; j < getRadius() + 1; j++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < getRadius() * 2 - 1; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
	}
}
