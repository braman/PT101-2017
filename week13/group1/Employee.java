class Employee {
	
	private String firstName;
	private String lastName;
	private static int count = 0;
	
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		++count;
	}
	
	
	public static int getCount() {
		return count;
	}
	
	
	public String toString() {
		return String.format("Employee %s %s has count %d", 
			firstName, lastName, count);
	}
	
} 
