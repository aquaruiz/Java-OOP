package mooD3;

public abstract class Character<T> implements GameObject<T>{
	private String username;
	private String characterType;
	private int level;
	private Number specialPoints;
	private T hashedPassword;

	public Character(String username, String characterType, int level, Number specialPoints) {
		this.username = username;
		this.characterType = characterType;
		this.level = level;
		this.specialPoints = specialPoints;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public String getCharacterType() {
		return this.characterType;
	}
	
	public Number getSpecialPoints() {
		return this.specialPoints;
	}
	
	public int getLevel() {
		return this.level;
	}

	public T getHashedPassword() {
		return hashedPassword;
	}
	
	public void setHashedPassword(T hashedPass) {
		this.hashedPassword = hashedPass;
	}
	
	@Override
	public String toString() {
		return String.format("\"%s\" | \"%s\" -> %s", 
						this.getUsername(),
						this.getHashedPassword(),
						this.getCharacterType());
	}
}