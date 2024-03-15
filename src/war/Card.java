package war;
/**
 * 
 * @author marcy
 * @since March 6th 2024
 * Object representing a card, has a value, and suit number that make the name of the card 
 */
public class Card implements Comparable<Card>{
	

private String name;
private int value;
private int suitNum;

/**
 * 
 * @param value Value of card from 2 to 14 (11:Jack 12:Queen 13:King 14:Ace)
 * @param suitNum Suit of card in int form (0:Clubs 1:Diamonds 2:Hearts 3:Spades)
 */
public Card(int value, int suitNum) {	//No default method because a blank card makes no sense
	this.value = value;				
	this.suitNum = suitNum;
	setName();
}

/**
 * 
 * @return Name of card in the form of a String(i.e. "Ace of Spades")
 */
public String describe() {
	return name;
}

/**
 * 
 * @return Value of card in integer form (2-14)
 */
public int getValue() {
	return value;
}

/**
 * 
 * @return Name of the face of the card in a string (i.e. "Jack")
 */
public String getFace() {
	return name.split(" ")[0];
}

/**
 * 
 * @return Suit of card in a string (i.e. "Hearts")
 */
public String getSuit() {
	return name.split(" ")[2];
}

/**
 * 
 * @return Suit of card in the form of a number
 */
public int getSuitNumber() {
	return suitNum;
}

/**
 * 
 * @param value Sets integer value of card from 2 through 14 (11:Jack 12:Queen 13:King 14:Ace)
 */
public void setValue(int value) {
	this.value = value;
	setName();	
}

/**
 * 
 * @param suit Sets integer value of suit (0:Clubs 1:Diamonds 2:Hearts 3:Spades)
 */
public void setSuit(int suit) {
	this.suitNum = suit;
	setName();
}

/**
 * Method used to set the name after a value is changed in the code
 */
private void setName() {
	switch(value) {
	case 2:
		name = "Two";
		break;
	case 3:
		name = "Three";
		break;
	case 4:
		name = "Four";
		break;
	case 5:
		name = "Five";
		break;
	case 6: 
		name = "Six";
		break;
	case 7:
		name = "Seven";
		break;
	case 8:
		name = "Eight";
		break;
	case 9:
		name = "Nine";
		break;
	case 10:
		name = "Ten";
		break;
	case 11:
		name = "Jack";
		break;
	case 12:
		name = "Queen";
		break;
	case 13:
		name = "King";
		break;
	case 14:
		name = "Ace";
		break;
	}
	name += " of ";
	switch(suitNum) {
	case 0:
		name+= "Clubs";
		break;
	case 1:
		name+= "Diamonds";
		break;
	case 2:
		name+= "Hearts";
		break;
	case 3:
		name+= "Spades";
	}

		

}
	
@Override
public String toString() {
	return "Card [name=" + name + ", value=" + value + ", suitNum=" + suitNum + "]";
}


/**
 * @param card Card this card is being compared to
 * @return -1 if the other card is greater; 1 if this card is greater; 0 if they have the same value
 */
@Override
public int compareTo(Card card) {
	// TODO Auto-generated method stub
	if(value < card.getValue()) {
		return -1;
	}
	else if(value > card.getValue()) {
		return 1;
	}	
	return 0;
}




}









