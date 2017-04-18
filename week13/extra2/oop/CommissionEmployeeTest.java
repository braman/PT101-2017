public class CommissionEmployeeTest {
	
	public static void main(String args[]) {
		CommissionEmployee emp1 = new CommissionEmployee(
			"John",
			"Smith",
			"22-22-2222",
			10000,
			0.1
		);
		
		
		//output by get methods
		
		System.out.println("Information obtained with get methods:");
		
		System.out.printf("First name: %s\n", emp1.getFirstName());
		System.out.printf("Last name: %s\n", emp1.getLastName());
		System.out.printf("SSN: %s\n", emp1.getSocialSecurityNumber());
		System.out.printf("Gross sales: %.2f\n", emp1.getGrossSales());
		System.out.printf("Commission Rate: %.2f\n", emp1.getCommissionRate());
		
		//output by toString
		System.out.println();
		
		System.out.println("Information obtained with toString method:");
		System.out.println(emp1);
		
		
	}
} 
