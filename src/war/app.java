package war;
import java.util.Scanner;
import java.util.ArrayList;
public class app {
	public static void main(String[] args) {
		//setting up input, players and deck
		Scanner scan = new Scanner(System.in);					
		ArrayList<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
		deck.shuffle();
		
		//allowing for input of the player names
		System.out.print("Player 1 name: ");					
		String name = scan.nextLine();
		players.add(new Player(name));
		System.out.print("Player 2 name: ");
		name = scan.nextLine();
		players.add(new Player(name));
		
		
		//experimenting with exceptions
		try {
			//dealing cards to players
			//uses remainder to deal evenly between all players
			for(int ix = deck.size(); ix > 0; ix--) {
					players.get(ix%players.size()).getCard(deck.draw());			
			}
		}
		catch(DeckIsEmptyException e) {
			e.printStackTrace();
		}
		
		//set up placeholder values for next for loop
		Card card1,card2;										
		String winner;
		
		//printing the header using printf to make it pretty and even
		System.out.printf("%17s       %s%n",players.get(0).getName(),players.get(1).getName());
		
		//main game function
		//store card data in temporary variable and comparing them to see which is larger
		//winner is printed with an X on its side of the colon
		for(int ix = 0; ix < 26; ix++) {
			card1 = players.get(0).flip(0);
			card2 = players.get(1).flip(0);
			
			switch(card1.compareTo(card2)) {
			case -1:
				players.get(1).incrementScore();
				winner = "   : X ";
				break;
			case 0:
				winner = "   :   ";
				break;
			case 1:
				winner = " X :   ";
				players.get(0).incrementScore();
				break;
			default:
				winner = "XXXXXXX";
			}
			System.out.printf("%17s%s%s%n", card1.describe(),winner,card2.describe());
			
		}
		
		//compare the two scores and print out the winner
		if(players.get(0).getScore() > players.get(1).getScore()) {
			System.out.printf("%s is the winner", players.get(0).getName());
		}
		else if(players.get(1).getScore() > players.get(0).getScore()) {
			System.out.printf("%s is the winner", players.get(1).getName());
		}
		else {
			System.out.println("Draw");
		}
		scan.close();
	}
}
