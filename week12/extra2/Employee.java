class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String firstName, String lastName, 
		Date dateOfBirth, Date dateOfHire) {
			
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = dateOfBirth;
		this.hireDate = dateOfHire;
	}
	
	public String toString() {
		return String.format("%s, %s Hired: %s Birth: %s", 
			firstName, lastName, hireDate, birthDate);
	}
} 
