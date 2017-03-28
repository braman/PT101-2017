class PassArray {
	
	public static void main(String args[]) {
		
		int array[] = {1, 2, 3, 4, 5};
		
		printArray(array);
		
		modifyArray(array);
		
		printArray(array);
		
		modifyElement(array[0]);
		modifyElement(array[2]);
		modifyElement(array[4]);
		
		printArray(array);
	}
	
	public static void printArray(int arr[]) {
		for (int e: arr) {
			System.out.print(e + " ");
		}
		
		System.out.println();
	}
	
	public static void modifyElement(int element) {
		element += 2;
	}
	
	public static void modifyArray(int array2[]) {
		for (int i=0;i<array2.length;i++) {
			array2[i] *= 2;
		}
	}
	
} 
