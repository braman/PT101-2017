import java.util.Arrays;

class ArrayManipulations {
	
	public static void main(String args[]) {
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		
		Arrays.sort(doubleArray);
			
		for (double e: doubleArray) {
			System.out.print(e + " ");
		}	
		
		System.out.println();
		
		Arrays.fill(doubleArray, 10);
		
		
		for (double e: doubleArray) {
			System.out.print(e + " ");
		}	
		
		System.out.println();
		
		
		int a[] = {1,2,3,4,5};
		int b[] = new int[20];
		
		//for (int i=0;i<a.length;i++) {
		//	b[i] = a[i];
		//}
		
		System.arraycopy(a, 0, b, 19, a.length);
		
		
		for (int e: b) {
			System.out.print(e + " ");
		}	
		
		System.out.println();
		
		
		
		
	}
	
} 
