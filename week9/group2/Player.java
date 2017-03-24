class Player {
	
	String name;
	Card cards[];

	public Player(String name) {
		this.name = name;
		cards = new Card[12];
	}
	
	public void printCards() {
		System.out.printf("Player %s:\n", name);
		for (Card c: cards) {
			if (c != null) {
				System.out.println(c);
			}
		}
		
	}
	
} 
