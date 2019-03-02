package cardsWithPower;

public class Card {
	final DeckRank deckRank;
	final DeckSuit deckSuit;
	
	public Card(DeckRank deckRank, DeckSuit deckSuit) {
		this.deckRank = deckRank;
		this.deckSuit = deckSuit;
	}
	
	private int calcPower() {
		return this.deckRank.getValue() + this.deckSuit.getValue();
	}
	@Override
	public String toString() {
		return String.format("Card name: %s of %s; Card power: %d", 
				this.deckRank.name(),
				this.deckSuit.name(),
				this.calcPower());
	}
}