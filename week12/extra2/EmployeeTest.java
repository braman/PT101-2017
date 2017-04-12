class EmployeeTest {
	
	public static void main(String args[]) {
		Date birthDate = new Date(1989, 6, 7);
		Date hireDate = new Date(2016, 9, 1);
		
		Employee e1 = new Employee("Raman", "Buzaubakov", birthDate, hireDate);
		
		System.out.println(e1);
		
	}
	
} 
