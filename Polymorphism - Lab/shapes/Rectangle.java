package shapes;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		super.setArea(calculateArea());
		super.setPerimeter(calculatePerimeter());
	}
	
	final public double getHeight() {
		return height;
	}
	
	final public double getWidth() {
		return width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * this.width + 2 * this.height;
	}
	
	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
	
	
}
