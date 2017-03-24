import java.util.Random;

class RandomTest{
	
	private static void onlyOddOnes() {
		
		Random r = new Random();
		
		for (int i=0;i<10;i++) {
			int someNumber = 1 + 2 * r.nextInt(50);
			boolean minusSign = r.nextBoolean();
			
			someNumber = minusSign ? -someNumber : someNumber;
			
			System.out.printf("Random number %d is %d\n", i+1, someNumber);
			
		}
		
		
	}
	
	private static void onlyEvenOnes() {
		
		Random r = new Random();
		
		for (int i=0;i<10;i++) {
			int someNumber = 2 * r.nextInt(50);
			boolean minusSign = r.nextBoolean();
			
			someNumber = minusSign ? -someNumber : someNumber;
			
			System.out.printf("Random number %d is %d\n", i+1, someNumber);
			
		}
		
		
	}
	
	private static void example1() {
		Random r = new Random();
		for (int i=0;i<10;i++) {
			int someNumber = 20 + r.nextInt(80);
			boolean minusSign = r.nextBoolean();
			
			someNumber = minusSign ? -someNumber : someNumber;
			
			System.out.printf("Random number %d is %d\n", i+1, someNumber);
			
		}
	}
	
	public static void main(String args[]) {
		//onlyOddOnes();
		onlyEvenOnes();
	}
	
} 
