public class BasePlusCommissionEmployeeTest {
	
	public static void main(String args[]) {
		BasePlusCommissionEmployee emp1 = new BasePlusCommissionEmployee(
			"Makpal",
			"Isabekova",
			"22-11-2222",
			20000,
			0.07,
			1000
		);
		
		
		//output by get methods
		
		System.out.println("Information obtained with get methods:");
		
		System.out.printf("First name: %s\n", emp1.getFirstName());
		System.out.printf("Last name: %s\n", emp1.getLastName());
		System.out.printf("SSN: %s\n", emp1.getSocialSecurityNumber());
		System.out.printf("Gross sales: %.2f\n", emp1.getGrossSales());
		System.out.printf("Commission Rate: %.2f\n", emp1.getCommissionRate());
		System.out.printf("Base Salary: %.2f\n", emp1.getBaseSalary());
		
		//output by toString
		System.out.println();
		
		System.out.println("Information obtained with toString method:");
		System.out.println(emp1);
		
		
	}
} 
