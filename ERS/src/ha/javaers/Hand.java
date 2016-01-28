package ha.javaers;

public class Hand {
	private Card[] cards;
	private int numCards;
	
	Hand(Deck d, int p){
		numCards = 52/p;
		cards = new Card[numCards];
		for(int i = 0; i < numCards; i++){
			cards[i] = d.draw();
		}
	}
	
	public void displayAll(){
		for(int i = 0; i < numCards; i++){
			System.out.println(cards[i]);
		}
	}
	
	
}
