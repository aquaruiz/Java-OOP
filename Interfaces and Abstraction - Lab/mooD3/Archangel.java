package mooD3;

public class Archangel extends Character<String>{
	private final static String CHARACTER_TYPE = "Archangel";
	
	public Archangel(String username, int level, Integer specialPoints) {
		super(username, CHARACTER_TYPE, level, specialPoints);
		super.setHashedPassword(new StringBuilder(super.getUsername())
							.reverse()
//							 .append("\"")
							.append((2 + super.getUsername().length()) * 21)
							.toString());
	}

	@Override
	public String toString() {
		return super.toString() 
				+ String.format("%n%d", 
						this.getLevel() * this.getSpecialPoints().intValue());
	}
}
