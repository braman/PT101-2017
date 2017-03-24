class OverloadingTest {
	
	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int max(int a, int b, int c) {
		int maxTemp = a;
		
		if (maxTemp < b) {
			maxTemp = b;
		}
		
		if (maxTemp < c) {
			maxTemp = c;
		}
		
		return maxTemp;
	}
	
	public static void main(String args[]) {
		int max1 = max(1, 4, 5);
		
		System.out.printf("Max1=%d\n", max1);
		
	}
	
} 
