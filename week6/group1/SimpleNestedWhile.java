class SimpleNestedWhile {
	public static void main(String args[]) {
		boolean break1 = false;
		boolean break2 = false;	
		
/*		
		while (!break1) {
			System.out.println("Inside while1");
			while (!break2) {
				System.out.println("Inside while2");
				break1 = true;
				break;
			}
		}

		while1: while (true) {
			System.out.println("Inside while1");
			while2: while (true) {
				System.out.println("Inside while2");
				
				break while1;
			}
		}
*/		
		
		for1: for (int i=0;i<10;i++) {
			if (i == 8) {
				continue for1;
			}

			System.out.println("i=" + i);
		}

		
	}
	
}
