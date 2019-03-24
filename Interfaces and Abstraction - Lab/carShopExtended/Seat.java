package carShopExtended;

public class Seat implements Sellable{
	private String model;
	private String color;
	private Integer horsePower;
	private String countryProduced;
	private Double price;
	
	public Seat(String model, String color, Integer horsePower, String country, Double price) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
		this.countryProduced = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("This is %s produced in %s and have %d tires%n%s sells for %f", 
				this.getModel(),
				this.countryProduced,
				Car.TIRES,
				this.getModel(),
				this.getPrice());
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

	@Override
	public Double getPrice() {
		return this.price;
	}
}