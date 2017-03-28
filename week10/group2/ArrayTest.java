class ArrayTest {
	
	
	public static void main(String args[]) {
		
		int a[] = {1, 2, 3};
		int b[] = {1, 2, 3};
		
		if (a == b) {
			System.out.println("Hello!");
		}
		
	}
	
	public static void main2(String args[]) {
		
		int a1[] = {1,2,3};
		int b1[] = a1;
		
		
		a1[0] = 0;
		
		b1[0] = 10;
		
		//a1: 0 2 3
		//b1: 10 2 3
		
		
		printArray(a1);
		printArray(b1);		

	}
	
	
	public static void printArray(int arr[]) {
		for (int e: arr) {
			System.out.print(e + " ");
		}
		
		System.out.println();
	}
} 
