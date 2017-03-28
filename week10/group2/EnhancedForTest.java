class EnhancedForTest {
	
	public static void main(String args[]) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		int sum1 = 0;
		
		for (int i=0;i<array.length;i++) {
			int t = array[i];
			
			sum1 += t;
			
			System.out.println("loop1:" + t);
		}
		
		System.out.println("Sum=" + sum1);
		
		int sum2 = 0;
		
		for (int e: array) {
			sum2 += e;
			System.out.println("loop2:" + e);
		}
		
		System.out.println("Sum=" + sum2);
		
		
		
		
	}
	
} 
