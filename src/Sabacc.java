
public class Sabacc {
	
	public static void main (String [] args ){
		System.out.println("Hello world");
		Card[] deck = Deck.buildDeck();
		Deck.displayDeck(deck);
		
		int chosen = (int)(Math.random()*deck.length);
		Card picked = deck[chosen];
		
		System.out.println("you picked a " + picked);
		System.out.println("its worth " + picked.value);
	
	}
}
