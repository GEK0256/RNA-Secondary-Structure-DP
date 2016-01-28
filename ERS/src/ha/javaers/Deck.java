package ha.javaers;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;	
	
	Deck(){
		cards = new ArrayList<Card>();
		int index1, index2, size;
		Random generator = new Random();
		Card temp;
		//initializing the deck
		for(int i = 0; i < 4; i++){
			for(int j  = 0; j < 14; j++){
				cards.add(new Card(i, j));
			}
		}
		//shuffling the deck
		for(int i = 0; i < 100; i++){
			index1 = generator.nextInt(cards.size() - 1);
			index2 = generator.nextInt(cards.size() - 1);
			
			temp = cards.get(index2);
			cards.set(index2, cards.get(index1));
			cards.set(index1, temp);
		}
	}
	
	public Card draw(){
		return cards.remove(0);
	}
}
