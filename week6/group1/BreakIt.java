public class BreakIt {
	
	public static void main(String args[]) {

		int number = 31;
		
		while (true) {
			System.out.println("Before break");
			
			// number / 13 = int < 13
			if (number % 13 == 0) {
				break;
			}
			
			number++;
			
		}
		
		System.out.println("After loop");
	}
	
} 
