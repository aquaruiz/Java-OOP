package animals;

public abstract class Animal {
	private String name;
	private String favoriteFood;
	
	public Animal(String name, String favouriteFood) {
		this.name = name;
		this.favoriteFood = favouriteFood;
	}
	
	public String explainSelf() {
		return String.format("I am %s and my favourite food is %s", 
				this.name,
				this.favoriteFood);
	};
}
