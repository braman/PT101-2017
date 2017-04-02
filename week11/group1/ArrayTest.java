class ArrayTest {
	
	
	
	
	public static void main(String args[]) {
		int[] arrayABC = {1,2,3,9,8,7};
		
		arrayABC[0] = 10;
		
		int[] arrayABC2 = new int[20];
		
		for (int i=0;i<arrayABC.length;i++) {
			arrayABC2[i] = arrayABC[i];
		}
		
		arrayABC = arrayABC2;
		
		
		
	}
	
}