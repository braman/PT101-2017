class MethodOverload {
	
	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}		 
	}

	public static void main(String args[]) {
		
		MethodOverload mo = new MethodOverload();
		
		double result = mo.max(1, 5);
		
		System.out.printf("Max of %s and %s is %s\n",
			1, 5, result);
		
	}
	
} 
