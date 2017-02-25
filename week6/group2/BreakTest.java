class BreakTest {

	public static void main(String args[]) {

		//loop1
		for (int i=1;i<=10;i++) {

			//loop2
			for (int j=1;j<=10;j++) {
				System.out.println("Before break");


				if (true) {	
					break;	
				}

				System.out.println("After break");

			}

			System.out.printf("%d ", i);
		}

	}

}
