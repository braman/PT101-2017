class MethodTest {

	private static void testN(double n) {
		System.out.println("TestN double: " + n);
	}

/*	
	private static void testN(int n) {
		System.out.println("TestN int: " + n);
	}
*/
	public static void main(String args[]) {
		testN(1);
		testN(1.0);
	}
} 
