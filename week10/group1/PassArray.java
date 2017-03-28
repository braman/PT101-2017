class PassArray {
	
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5};
			
		printAllElements(array);

		modifyArray(array);
		
		printAllElements(array);
	
		modifyElement(array[0]);
		modifyElement(array[1]);
		modifyElement(array[4]);
		
		printAllElements(array);
	}
	
	public static void printAllElements(int a[]) {
		for (int e: a) {
			System.out.print(e + " ");
		}
		
		System.out.println();
	}
	
	public static void modifyArray(int array2[]) {
		for (int i=0;i<array2.length;i++) {
			array2[i] *= 2;
		}
	}
	
	public static void modifyElement(int e) {
		e *= 2;
	}
} 
