//package shoppingSpree;

public class Product {
	private String name;
	private double cost;
	
	public Product(String name, double cost) throws Exception {
		this.setName(name);
		this.setCost(cost);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception {
		if (name.trim().isEmpty()) {
			throw new Exception("Name cannot be empty");
		}
		
		this.name = name.trim();
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) throws Exception {
		if (cost < 0) {
			throw new Exception("Cost cannot be negative");
		}

		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
