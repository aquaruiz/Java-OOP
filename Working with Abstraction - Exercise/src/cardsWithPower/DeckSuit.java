package cardsWithPower;

public enum DeckSuit {
	CLUBS(0), 
	DIAMONDS(13), 
	HEARTS(26),
	SPADES(39);
	
	private int value;
	
	private DeckSuit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
