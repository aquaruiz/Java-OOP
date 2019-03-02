package cardSuit;

public enum DeckSuit {
	CLUBS, 
	DIAMONDS, 
	HEARTS,
	SPADES;
	
	private int value;
	
	private DeckSuit() {
	}
	
	public int getValue() {
		return value;
	}
}
