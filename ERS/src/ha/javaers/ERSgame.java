package ha.javaers;

public class ERSgame {
	int numplayers;
	Hand[] players;
	Deck d = new Deck();
	ERSgame(int p){
		numplayers = p;
		players = new Hand[p];
		for(int i = 0; i  < p; i++){
			players[i] = new Hand(d, p);
		}
	}
	
	public void draw(int p){
		
	}
	
	public static void main(String[] args){
		
	}
}
