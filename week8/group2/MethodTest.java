class MethodTest {
	
	
	private static void testN(float f) {
		System.out.printf("testN for float %s\n", f);
	}
	
	public static void main(String args[]) {
		long n = 123;
		testN(n);
	}
	
	public static void main2(String args[]) {
		double n = 1.58;
		double r1 = Math.round(n);
		int r2 = (int) Math.round(n);
		
		System.out.println(r1);		
		System.out.println(r2);		
	}
	
} 
