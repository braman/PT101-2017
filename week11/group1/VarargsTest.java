class VarargsTest {
	
	public static double average(double ... numbers) {
		double avg = 0;
		
		for (double g:numbers) {
			avg += g;
		}
		
		return avg / numbers.length;
	}

	public static double average2(double [] numbers) {
		double avg = 0;
		
		for (double g:numbers) {
			avg += g;
		}
		
		return avg / numbers.length;
	}

	
	
	public static void main(String ... args) {
		double result = average(1, 2, 3);	
		System.out.printf("Average: %.2f\n", result);

		
	}
} 
