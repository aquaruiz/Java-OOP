package shapesDrawing;

public class Rectangle implements Drawable {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;	
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < this.getHeight(); i++) {
			System.out.print("*");
			
			for (int j = 0; j < this.getWidth(); j++) {
				System.out.print(" ");
				
				if (i == 0 || i == this.getHeight() - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
		
	}

}
