import java.util.Random;

class SumArray {
	
	public static void main(String args[]) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };		
		
		int sum = 0;
		
		for (int i=0;i<array.length;i+=2) {
			sum += array[i];
		}
			
		System.out.println("Sum=" + sum);	
		
		
	}
	
} 
