package carShopExtended;

public class Audi implements Rentable{
	private String model;
	private String color;
	private Integer horsePower;
	private String countryProduced;
	
	private Integer minRentDay;
	private Double pricePerDay; 
	
	public Audi(String model, String color, Integer horsePower, String country, Integer days, Double pricePerDay) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
		this.countryProduced = country;
		this.minRentDay = days;
		this.pricePerDay = pricePerDay;
	}
	
	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public Integer getHorsePower() {
		return this.horsePower;
	}

	@Override
	public Integer getMinRentDay() {
		return this.minRentDay;
	}

	@Override
	public Double getPricePerDay() {
		return this.pricePerDay;
	}

	@Override
	public String toString() {
		return String.format("This is %s produced in %s and have %d tires%nMinimum rental period of %d days. Price per day %f", 
				this.getModel(),
				this.countryProduced,
				Car.TIRES,
				this.getMinRentDay(),
				this.getPricePerDay()
			);
	}
}