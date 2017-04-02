import java.util.Random;

class VarargsTest {
	
	public static int min(int ... args) {
		int min = args[0];
		
		for (int i=0;i < args.length;i++) {
			if (min > args[i]) {
				min = args[i];
			}
		}
		
		return min;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		
		int min1 = rand.nextInt(100);
		int min2 = rand.nextInt(100);
		int min3 = rand.nextInt(100);
		
		int result = min(min1, min2, min3);
		
		System.out.printf("The min is %d\n", result);
	}
	
} 
