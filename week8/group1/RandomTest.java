import java.util.Random;

class RandomTest {
	
	public static void main(String args[]) {
		
		Random r = new Random();
		
		int n = r.nextInt(100);
		
		System.out.printf("number is %d\n", n);
	}
} 
