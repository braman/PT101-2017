class WhileTest {
	
	public static void main(String args[]) {
		
		/*
		boolean break1 = false;
		boolean break2 = false;
		
		
		do {
			System.out.println("Before loop1");
			
			while (!break2) {
				break1 = true;
				break;
			}
			
			System.out.println("After loop1");
		
		} while (!break1);
		*/
		
		while1: do {
			System.out.println("Before loop1");
			
			while2: while (true) {
				System.out.println("Before loop2");
				break while1;
			}
			
			//System.out.println("After loop1");
		
		} while (true);
		
		
		
	}
}
