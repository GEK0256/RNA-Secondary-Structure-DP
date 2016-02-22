package ha.javaers;
//AIJFILDFJSggi
public class Card {
	private int rank, suit;
	private int xLoc, yLoc;
	
	//static list of suits
	private static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
	//static list of ranks, note ranks are numbered for convenience later on
	private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	
	
	Card(int suit, int rank){
		this.rank = rank;
		this.suit = suit;	
	}
	
	@Override
	public String toString(){
		return ranks[rank] + "of" + suits[suit];
	}
	
	public int getRank(){
		return rank;
	}
	public int getSuit(){
		return suit;
	}
	
	public void draw(Card c){
		
	}
}
