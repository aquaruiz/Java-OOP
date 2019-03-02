package cardRank;

public class Main {

	public static void main(String[] args) {
		System.out.println("Card Ranks:");
		
		for (DeckRanks type : DeckRanks.values()) {
			System.out.printf("Ordinal value: %d; Name value: %s%n",
						type.getValue(),
						type.name());
		}
	}

}
