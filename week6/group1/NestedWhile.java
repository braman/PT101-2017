class NestedWhile {
	
	public static void main(String args[]) {
		boolean break1 = false;
		boolean break2 = false;
		boolean break3 = false;
		
		
		
		/*while1*/
		while (!break1) {
			System.out.println("Inside while1");
			/*while2*/
			while (!break2) {
				System.out.println("Inside while2");
				
				if (true) {
					break;
				}
				
				/*while3*/
				while (!break3) {
					System.out.println("Inside while3");	
					for (;;) {
						System.out.println("Inside for loop");
						break1 = true;
						break;	
					}
				}
			}
			
		}
		
	}
	
}
