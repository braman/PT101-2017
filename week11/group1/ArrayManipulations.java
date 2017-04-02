import java.util.Arrays;


class ArrayManipulations {
	
	
	private static void printArray(int array1[]) {
		for (int a: array1) {
			System.out.printf("%d ", a);
		}
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		int array1[] = {8,5,1,5,3,2};
		
		Arrays.sort(array1);	
		
		printArray(array1);
		
		Arrays.fill(array1, 3);
		
		printArray(array1);
		
		int array2[] = new int[20];
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		printArray(array2);
		
		
		int array3[] = {8,5,1,5,3,2};
		int array4[] = {8,5,1,5,3,2};
		
		boolean isEqual = Arrays.equals(array3, array2);
		
		System.out.printf("array3 and array2 are equal: %b\n", isEqual);
		
		
	}
	
} 
