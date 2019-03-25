package vehiclesExtension;

public class Vehicle {
	private double fuelQuantity;
	private double tankCapacity;
	private double litersPerKm;
	
	public Vehicle(double fuel, double liters, double tankCapacity) {
		this.fuelQuantity = fuel;
		this.litersPerKm = liters;
		this.tankCapacity = tankCapacity;
	}
	
	public void drive(double km, double ads) throws Exception {
		checkFuel(km, ads);
		this.fuelQuantity -= km * this.litersPerKm;
		this.fuelQuantity -= km * ads;
	}
	
	private void checkFuel(double km, double ads) throws Exception {
		if (this.fuelQuantity < km * (ads + this.litersPerKm)) {
			throw new Exception(this.getClass().getSimpleName() + " needs refueling");
		}
	}

	public void refuel(double fuel) throws Exception {
		if (fuel <= 0) {
			throw new Exception("Fuel must be a positive number");
		}

		checkCapacity(fuel);
		this.fuelQuantity += fuel;
	}
	
	private void checkCapacity(double fuel) throws Exception {
		if (this.tankCapacity < fuel + this.fuelQuantity) {
			throw new Exception("Cannot fit fuel in tank");
		}		
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f", 
				this.getClass().getSimpleName(),
				this.fuelQuantity);
	}
}