abstract class Employee {
	
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	
	Employee(String firstName, String lastName, String ssn) {
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(ssn);
	}
	
	abstract double earnings();
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		this.socialSecurityNumber = ssn;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
} 
