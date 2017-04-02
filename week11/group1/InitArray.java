class InitArray {
	
	public static void main(String args[]) {
		
		
		int array1[][] = {{1,2,3}, {4,5,6}};
		
		int array2[][] = {{1,2}, {3}, {4,5,6}};
		
		for (int i=0;i<array1.length;i++) {
			System.out.printf("element %d has %d elements\n", 
				i, array1[i].length);
		}

		System.out.println();
		
		for (int i=0;i<array2.length;i++) {
			System.out.printf("element %d has %d elements\n", 
				i, array2[i].length);
			
		}
		
		for (int row = 0;row < array2.length;row++) {
			
			for (int column = 0;column < array2[row].length;column++) {
				
				System.out.printf("row %d column %d has %d\n", row, column, array2[row][column]);
			
			}
			
		}
		
	}
	
} 
