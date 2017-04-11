class Employee {
	
	private String firstname;
	private String lastname;	
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String firstname, 
					String lastname,
					Date dateOfBirth, 
					Date dateOfHire) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}
	
	public String toString() {
		return String.format("%s, %s Hired: %s Birthday: %s",
			firstname, lastname, hireDate, birthDate);
	}
	
}
 
