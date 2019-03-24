package mooD3;

public class Demon extends Character<Integer>{
	private final static String CHARACTER_TYPE = "Demon";

	public Demon(String username, int level, Double specialPoints) {
		super(username, CHARACTER_TYPE, level, specialPoints);
		super.setHashedPassword((2 + super.getUsername().length()) * 217); // +2
	}

	@Override
	public String toString() {
		return super.toString()
				
				+ String.format("%n%.1f", 
						this.getLevel() * this.getSpecialPoints().doubleValue());
	}
}
