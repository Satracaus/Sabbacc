

class Card {
	int value;
	String suit;
	String name;
	boolean splCard = false;
	
	public String toString(){
		return name + " of " + suit + " " + splCard;
	}
}


public class Deck {
	
	public static Card[] buildDeck() {
		String[] suits = { "Sabers", "Flasks", "Coins", "Staves"};
		String[] names = { "empty string", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Commander", "Mistress", "Master", "Ace"};
//		String[] specialCards = {"Idiot", "Queen of Air and Darkness", "Endurance", "Balance", "Demise", "Moderation", "The Evil One", "The Star"};
		//another
		int i = 0;
		Card[] deck = new Card[60];
		
		for (String suit : suits) {
			for (int v = 1; v <= 15; v++) {
				Card c = new Card();
				c.suit = suit;
				c.name = names[v];
				//c.splCard = specialCards;
				if (v == 15 )
					c.value = 15;
				else
					c.value = v;
				
				deck[i] = c;
				i++;
				
				
				
				
			}
		}
		return deck;
	}
	
	public static void displayDeck(Card[] deck) {
		for (Card c : deck)
			System.out.println(c.value +"\t"+c + c.splCard);
	}
	
	public void shuffle(){
		
	}
	
	public void dealCard(){
		
	}

}
