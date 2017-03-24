import java.util.Random;

class Craps {
	
	private static final Random randomNumbers = new Random();
	
	private enum Status {
		CONTINUE,
		WON,
		LOST;
	}
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	
	public static void main(String args[]) {
		
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;
			
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			
			default:
				myPoint = sumOfDice;
				gameStatus = Status.CONTINUE;
				System.out.printf("My point is %d\n", myPoint);
		}
		
		
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;	
			} else if (sumOfDice == SEVEN) {
				gameStatus = Status.LOST;
			}
		}
		
		
		if (gameStatus == Status.WON) {
			System.out.println("Player wins!");
		} else if (gameStatus == Status.LOST) {
			System.out.println("Player loses!");
		}
		
	}
	
	private static int rollDice() {
		int d1 = 1 + randomNumbers.nextInt(6);
		int d2 = 1 + randomNumbers.nextInt(6);
		int sum = d1 + d2;
		
		System.out.printf("Rolled dices are %d %d\n", d1, d2);
		
		return sum;
	}
	
	
	
} 
