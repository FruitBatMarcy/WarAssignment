package war;

import java.util.ArrayList;

/**
 * @author marcy
 * @since March 6th 2024
 * Object defines a player of a card game including a name, score and hand of cards
 */
public class Player{

	private ArrayList<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	/**
	 * Constructor sets the name of the player and sets the score to zero
	 * @param name The name of the player
	 */
	public Player(String name) {
		score = 0;
		this.setName(name);
	}
	
	/**
	 * method prints all cards in players hand to the players hand
	 */
	public void describe() {
		for(int ix = 0; ix < hand.size(); ix++) {
			System.out.printf("%d: %s | ",ix,hand.get(ix));
		}
		
	}
	
	/**
	 * plays a card from a players hand returning it and removing it from hand
	 * @param cardIX index of played card
	 * @return played card
	 */
	public Card flip(int cardIX) {
		return hand.remove(cardIX);
	}
	
	/**
	 * Method scores a point for player
	 */
	public void incrementScore() {
		score++;
	}
	
	/**
	 * @param card Card added to hand
	 */
	public void getCard(Card card) {
		hand.add(card);
	}

	/**
	 * @return the score of the player
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * 
	 * @return name of player
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name changes the name of player
	 */
	public void setName(String name) {
		this.name = name;
	}
}
