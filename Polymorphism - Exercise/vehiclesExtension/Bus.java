package vehiclesExtension;

public class Bus extends Vehicle{

	public Bus(double fuel, double liters, double capacity) {
		super(fuel, liters, capacity);
	}

	public void drive(double km, boolean isEmpty) throws Exception {
		double ads = 1.4;
		
		if (isEmpty) {
			ads = 0;
		}
		
		super.drive(km, ads);
	}
}
