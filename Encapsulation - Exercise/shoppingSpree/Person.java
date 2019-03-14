//package shoppingSpree;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	private String name;
	private double money;
	private List<Product> products;
	
	public Person(String name, double money) throws Exception {
		this.setName(name);
		this.setMoney(money);
		this.products = new LinkedList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception {
		if (name == null || name.trim().isEmpty()) {
			throw new Exception("Name cannot be empty");
		}
		
		this.name = name;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) throws Exception {
		if (money < 0) {
			throw new Exception("Money cannot be negative");
		}
		
		this.money = money;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	private void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void buyProduct(Product product) throws Exception {
		if (product == null) {
            throw new IllegalArgumentException();	
		}
		
		if (product.getCost() > this.getMoney()) {
			 throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
		}
		
			this.setMoney(this.getMoney() - product.getCost());
			this.addProduct(product);
			this.printBought(product);
	}
	
	private void printBought(Product product) {
		System.out.println(String.format("%s bought %s",
					this.getName(),
					product.getName()));
	}

	@Override
	public String toString() {
		String output = this.getName() + " - ";

		if (this.getProducts().isEmpty()) {
			output += "Nothing bought";
		} else {
			output += this.getProducts().stream()
					.map(e -> e.getName()).collect(Collectors.joining(", "));
		}
		
		return output;
	}
}