import java.util.Random;

class RollDie {
	
	public static void main(String args[]) {
		Random random = new Random();
		
		int frequencies[] = new int[7];
		
		for (int roll=1;roll<6_000_000;roll++) {
			int index = 1 + random.nextInt(6);
			++frequencies[index];
		}
		
		System.out.printf("%s%10s\n", "Face", "Frequency");
		
		for (int face=1;face<frequencies.length;face++) {
			System.out.printf("%4d%10d\n", face, frequencies[face]);
		}
		
	}
	
} 
