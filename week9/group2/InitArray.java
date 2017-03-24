import java.util.Random;

class InitArray {
	
	public static void main(String args[]) {
		Random rand = new Random();
		
		final int N = Integer.parseInt(args[0]);
		
		
		int[] array = new int[N];
		
		for (int i=0;i<N;i++) {
			array[i] = rand.nextInt(1000);	
		}
		
		
		//array = new int[10];
		
		System.out.printf("%5s%5s\n", "Index", "Item");
		
		for (int i=0;i<array.length;i++) {
			System.out.printf("%d\t%d\n", i, array[i]);
		}
		
	}
	
} 
