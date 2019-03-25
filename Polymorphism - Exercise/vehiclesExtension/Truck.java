package vehiclesExtension;

public class Truck extends Vehicle {
	final String SEASON = "Summer";

	public Truck(double fuel, double liters, double capacity) {
		super(fuel, liters, capacity);
	}
	
	public void drive(double km) throws Exception {
		double ads = 1.6;
		super.drive(km, ads);
	}
	
	@Override
	public void refuel(double fuel) throws Exception {
		fuel *= 0.95;
		super.refuel(fuel);
	}
}