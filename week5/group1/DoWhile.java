public class DoWhile {
	
	public static void main(String args[]) {
		
		int counter = 1;
		
		do {
			System.out.printf("%d ", counter);
			counter++;
		} while (counter < 0);
		
		counter = 1;
		
		while (counter < 0) {
			System.out.printf("%d ", counter);
			counter++;
		} 
		
	}
}