package cardSuit;

public class Main {
	public static void main(String[] args) {
		System.out.println("Card Suits:");
		
		for (DeckSuit type : DeckSuit.values()) {
			System.out.printf("Ordinal value: %d; Name value: %s%n",
					type.ordinal(), type.name());
		}
	}
}
