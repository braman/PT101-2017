class IncArraySize {
	
	public static void main(String args[]) {
		
		String arr[] = new String[10];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = "string" + i;
		}
		
		
		String arr2[] = new String[15];
		
		//copy from old array
		
		for (int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		
		arr = arr2;
	}
	
} 
