import java.util.Random;

class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static Random random = new Random();
	
	public DeckOfCards() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", 
			"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Card[NUMBER_OF_CARDS];
		
		for (int i=0;i<NUMBER_OF_CARDS;i++) {
			deck[i] = new Card(faces[i/4], suits[i%4]);
		}
	}
	
	public void printAllCards() {
		for (int i=0;i<NUMBER_OF_CARDS/2;i++) {
			int f = i * 2;
			int s = f + 1;
			
			System.out.printf("%s of %s  %20s of %s \n", 
				deck[f].face, deck[f].suite,
				deck[s].face, deck[s].suite);
		}
	}
	
	
	public void shuffle() {
		for (int i=0;i<NUMBER_OF_CARDS;i++) {
			int randomCardIndex = random.nextInt(NUMBER_OF_CARDS);
			
			Card tempCard = deck[i];
			deck[i] = deck[randomCardIndex];
			deck[randomCardIndex] = tempCard;
		}
	}
	
	public static void main(String args[]) {
		DeckOfCards deckOfCards = new DeckOfCards();
		System.out.println("===== Before shuffle ======");	
		deckOfCards.printAllCards();
		System.out.println("===== After shuffle ======");
		deckOfCards.shuffle();
		deckOfCards.printAllCards();
	}
} 