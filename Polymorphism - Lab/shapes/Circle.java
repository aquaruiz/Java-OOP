package shapes;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
		super.setArea(calculateArea());
		super.setPerimeter(calculatePerimeter());
	}
	
	final public double getRadius() {
		return radius;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * this.radius * Math.PI;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
