abstract class Employee implements Payable {
	
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	abstract double earnings();
	
	public double getPaymentAmount() {
		return earnings();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
			getFirstName(),
			getLastName(),
			getSocialSecurityNumber()
		);
	}
	
} 
