import java.util.Random;


class RollDie {
	
	public static void main(String args[]) {
		Random random = new Random();
		
		int frequency[] = new int[7];
		
		for (int i=0;i<6_000_000;i++) {
			int randomDieFace = 1 + random.nextInt(6);
			
			frequency[randomDieFace] = frequency[randomDieFace] + 1;
		}
			
		System.out.printf("%s%10s\n", "Face", "Frequency");	
		
		for (int face = 1; face < frequency.length;face++) {
			System.out.printf("%4d%10d\n", face, frequency[face]);	
		}		
	}
} 
