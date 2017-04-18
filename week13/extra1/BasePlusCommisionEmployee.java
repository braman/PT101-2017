class BasePlusCommisionEmployee extends CommisionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommisionEmployee(String firstName, String lastName,
			String ssn, double sales, double rate, double salary) {
		
		super(firstName, lastName, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		if (salary >= 0) {
			baseSalary = salary;
		} else {
			throw new IllegalArgumentException("Invalid base salary");
		}
	}
	
	@Override	
	public double earnings() {
		return baseSalary + getCommissionRate() * getGrossSales();
	}
	
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
			"base plus commission employee", getFirstName(), getLastName(),
			"social security number", getSocialSecurityNumber(),
			"gross sales", getGrossSales(),
			"commission rate", getCommissionRate() );
	}
} 
