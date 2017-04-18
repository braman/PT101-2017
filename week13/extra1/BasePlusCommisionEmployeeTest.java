class BasePlusCommisionEmployeeTest {
	
	public static void main(String args[]) {
		BasePlusCommisionEmployee e = 
			new BasePlusCommisionEmployee("Bill", "Gates", "12038123819238",
				10000.0, 0.1, 500);
			
		System.out.println(e);

		System.out.println();

		e.setCommissionRate(0.2);
		
		
		System.out.println(e);

		
	}
	
} 
