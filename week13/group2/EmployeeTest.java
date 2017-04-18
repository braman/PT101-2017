class EmployeeTest {
	
	public static void main(String args[]) {
		System.out.printf("Counter before creating instances: %d\n", 0);
		Employee e1 = new Employee("Raman", "Buzaubakov");
		System.out.printf("Counter after creating instances1: %d\n", e1.getCount());
		System.out.printf("Employee: %s\n", e1);

	
		Employee e2 = new Employee("Bill", "Gates");
		System.out.printf("Counter after creating instances2: %d\n", e2.getCount());
		System.out.printf("Employee: %s\n", e2);

		
		
	}
	
} 
