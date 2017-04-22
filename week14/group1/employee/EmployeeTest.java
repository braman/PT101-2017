import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

class EmployeeTest {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		
		SalariedEmployee e1 = new SalariedEmployee(
			"John", "Smith", "123-456", 1000
		);
		
		System.out.println(e1);
		
		System.out.println();
		
		HourlyEmployee e2 = new HourlyEmployee(
			"Tom", "Cruz", "123-123", 10000, 8
		);
		
		System.out.println(e2);
		System.out.println();
		
		CommissionEmployee e3 = new CommissionEmployee(
			"Ilon", "Mask", "123-444", 4000 * 100_000, 0.05
		);
		
		System.out.println(e3);
		System.out.println();
		
		
		BasePlusCommissionEmployee e4 = new BasePlusCommissionEmployee(
			"Tim", "Cook", "123-555", 500 * 100_000, 0.01, 1_000_000
		);
		
		System.out.println(e4);
		System.out.println();
		
		List<Employee> allEmployees = new ArrayList<Employee>();
		
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		
		System.out.println("Earnings: ");
		
		for (Employee e: allEmployees) {
			System.out.printf("%s has %,.2f\n", e.getFirstName(), e.earnings());
		}
	}
	
} 
