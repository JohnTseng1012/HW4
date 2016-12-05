import java.util.ArrayList;

import java.util.Random;

class Deck {
	ArrayList<Card> usedCard;
	public int nUsed;
	private ArrayList<Card> cards;
	private ArrayList<Card> openCard;

	// TODO: Please implement the constructor
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();

		int n = nDeck;
		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y < 14; y++) {
					Card card = new Card(s, y);
					cards.add(card);
				}
			}
		}
		shuffle();
	}

	// TODO: Please implement the method to print all cards on screen
	public void printDeck() {
		// Hint: print all items in ArrayList<Card> cards,
		// please implement and reuse printCard method in Card class
		for (Card c : cards) {
			c.printCard();
			System.out.print("\n");
		}
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.size(); i++) {
			Random RR = new Random();
			int j = RR.nextInt(52);
			Card CCC = cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, CCC);
		}
		usedCard = new ArrayList<Card>();
		nUsed = 0;
		openCard = new ArrayList<Card>();
	}

	public Card getOneCard(boolean isOpened) {

		if (nUsed == cards.size()) {
			shuffle();
		}
		if(isOpened)openCard.add(cards.get(nUsed));
		usedCard.add(cards.get(nUsed));
		nUsed++;
		return usedCard.get(nUsed - 1);

	}

	public ArrayList<Card> getOpenedCard()
	{
		return openCard;
	}
}