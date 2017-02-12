class WhileTest  {
	
	public static void main(String args[]) {
		int product = 1;
		while ( product <= 100 ) {
			System.out.println("product:" + product);
			product = 3 * product;
		}
		
		System.out.println("product:" + product);
		
	}
}
