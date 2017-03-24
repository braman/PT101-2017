class Card {
	
	final static String[] faces = {"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
	
	final static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
	
	int cardNo; //6 - ACE
	
	//DIAMONDS 
	//SPADES
	//HEARTS 
	//CLUBS 
	int cardType; 
	
	@Override
	public String toString() {
		String suit = suits[cardType];
		String face = faces[cardNo];
		
		String title = String.format("%s of %s", face, suit);
		
		return title;
	}
	
}

 
