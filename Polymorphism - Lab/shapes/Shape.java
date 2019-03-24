package shapes;

public abstract class Shape {
	@SuppressWarnings("unused")
	private double perimeter;
	@SuppressWarnings("unused")
	private double area;

	public abstract double calculatePerimeter();
	public abstract double calculateArea();
	
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	protected void setArea(double area) {
		this.area = area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}
}
