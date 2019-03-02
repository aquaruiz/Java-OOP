package cardsWithPower;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String rank = scanner.nextLine();
		DeckRank deckRank = DeckRank.valueOf(rank);
		
		String suit = scanner.nextLine();
		DeckSuit deckSuit = DeckSuit.valueOf(suit);
		
		scanner.close();
		Card myCard = new Card(deckRank, deckSuit);
		System.out.println(myCard);
	}

}
