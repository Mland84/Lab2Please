package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {

		for (eSuit Suit : eSuit.values()) {
			for (eRank Rank : eRank.values()) {
				System.out.println(Rank.getiRankNbr());
				if (Rank == eRank.JOKER ){
					continue;
					
				}
				
				Card c = new Card(Rank, Suit);
				DeckCards.add(c);
				
			}
		}
		
		
		Collections.shuffle(DeckCards);
	}

	public Card DrawCard() {

		return DeckCards.remove(0);
	}
}
