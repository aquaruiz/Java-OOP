//package classBoxDataValidation;

public class Box {
	private double length;
	private double width;
	private double height;
	
	public Box(double length, double width,	double height) throws Exception {
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public void setLength(double length) throws Exception {
		if (length <= 0) {
			throw new Exception("Length cannot be zero or negative.");
		}
		
		this.length = length;
	}
	
	public void setWidth(double width) throws Exception {
		if (width <= 0) {
			throw new Exception("Width cannot be zero or negative.");
		}
		
		this.width = width;
	}
	
	public void setHeight(double height) throws Exception {
		if (height <= 0) {
			throw new Exception("Height cannot be zero or negative.");
		}
		
		this.height = height;
	}
	
	public double calculateSurfaceArea() {
		return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
	}
	
	public double calculateLateralSurfaceArea() {
		return 2 * this.length * this.height + 2 * this.width * this.height;
	}
	
	public double calculateVolume() {
		return this.length * this.width * this.height;
	}
}
