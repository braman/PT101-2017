class CommisionEmployeeTest {
	
	public static void main(String args[]) {
		CommisionEmployee e = new CommisionEmployee("John", "Smith", "12038123819238",
			10000.0, 0.1);
			
		System.out.println(e);

		System.out.println();

		e.setCommissionRate(0.2);
		
		
		System.out.println(e);

		
	}
	
} 
