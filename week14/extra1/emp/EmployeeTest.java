class EmployeeTest {
	
	public static void main(String args[]) {
		
		SalariedEmployee e1 = new SalariedEmployee("John", "Smith", "123-465", 1000);
		
		HourlyEmployee e2 = new HourlyEmployee("Tom", "Cruz", "123-222", 80_000, 1);
		
		CommissionEmployee e3 = new CommissionEmployee(
			"Waren", "Buffet", "123-333", 1_000_000_000, 0.99);
		
		BasePlusCommissionEmployee e4 = new BasePlusCommissionEmployee(
			"Steve", "Jobs", "123-444", 100_000_000, 0.1, 250_000);
		
		Employee[] employees = {e1, e2, e3, e4};

		for (Employee e: employees) {
			System.out.println(e);
			System.out.println();
		}
		
	}
	
} 
