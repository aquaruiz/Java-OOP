package vehiclesExtension;

public class Car extends Vehicle{
	final String SEASON = "Summer";
	
	public Car(double fuel, double liters, double capacity) {
		super(fuel, liters, capacity);
	}
	
	public void drive(double km) throws Exception {
		double ads = 0.9;
		super.drive(km, ads);
	}
}