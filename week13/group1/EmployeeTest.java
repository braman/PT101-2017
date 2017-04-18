import java.util.Scanner;
import static java.lang.Math.*;

class EmployeeTest {
	
	public static void main(String args[]) {
		double r = sin(123);	
		System.out.println(r);
		
		if (true) {
			return;
		}
		
		Employee e1 = new Employee("Raman", "Buzaubakov");
		
		System.out.println(e1);
		
		Employee e2 = new Employee("John", "Smith");
		
		System.out.println(e2);

		Employee e3 = new Employee("Bill", "Gates");
		
		System.out.println(e3);

		
	}
	
} 
