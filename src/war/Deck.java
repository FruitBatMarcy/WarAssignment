package war;

import java.util.*;
/**
 * 
 * @author marcy
 * @since March 6th 2024
 * Object defines a deck of playing cards with an arraylist of cards
 */
public class Deck {
private ArrayList<Card> deck = new ArrayList<Card>(); 

/**
 * Initializes with a standard 52 playing cards
 */
public Deck() {
	for(int ix = 0; ix < 4; ix++) {
		for(int iy = 2; iy < 15; iy++) {
			deck.add(new Card(iy,ix));
		}
	}
}

/**
 * Method creates a new list of cards and randomly adds the old deck to them 
 * then assigns the old decks reference pointer to the new deck
 */
public void shuffle() {
	ArrayList<Card> nDeck = new ArrayList<Card>();
	int randInt;
	for(int ix = deck.size(); ix > 0; ix--) {
		randInt = (int)(ix*Math.random());
		nDeck.add(deck.remove(randInt));
	}
	deck = nDeck;
}

/**
 * Method deals a card from the top of the deck
 * @return the top card of the deck
 * @throws DeckIsEmptyException Thrown if method is called on an empty deck
 */
public Card draw() throws DeckIsEmptyException {
	if(deck.size() > 0) {
	return deck.remove(0);
	}
	else {
		throw new DeckIsEmptyException("There are no more cards");
	}
	

}
/**
 * 
 * @return size of deck
 */
public int size() {
	return deck.size();
}
}
