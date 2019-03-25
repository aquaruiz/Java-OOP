package vehicles;

public class Vehicle {
	private double fuelQuantity;
	private double litersPerKm;
	
	public Vehicle(double fuel, double liters) {
		this.fuelQuantity = fuel;
		this.litersPerKm = liters;
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

	public void refuel(double fuel) {
		this.fuelQuantity += fuel;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f", 
				this.getClass().getSimpleName(),
				this.fuelQuantity);
	}
}