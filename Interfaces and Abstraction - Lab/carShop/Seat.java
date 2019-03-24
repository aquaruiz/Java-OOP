package carShop;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Seat implements Car, Serializable {
	private String model;
	private String color;
	private Integer horsePower;
	private String countryProduced;
	
	public Seat(String model, String color, Integer horsePower, String country) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
		this.countryProduced = country;
	}
	
	@Override
	public String toString() {
		return String.format("This is % produced in %s and have %d tires", 
				this.getModel(),
				this.countryProduced,
				Car.TIRES);
	}

	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}

	public Integer getHorsePower() {
		return this.horsePower;
	}
}