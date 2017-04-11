class EmployeeTest {
	public static void main(String args[]) {
		Date birthDate = new Date(7, 6, 1989);
		Date hireDate = new Date(1, 9, 2016);
		
		Employee e1 = new Employee(
			"Raman", "Buzaubakov",
			birthDate, hireDate);
		
		System.out.println(e1);
		
		
	}
	
	
} 
