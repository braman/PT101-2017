class CommisionEmployee extends Object {
	//page 369
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	
	public CommisionEmployee(String firstName, String lastName,
			String ssn, double sales, double rate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		socialSecurityNumber = ssn;
		setGrossSales(sales);	
		setCommissionRate(rate);
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	
	public void setGrossSales(double sales) {
		if (sales >= 0) {
			grossSales = sales;
		} else {
			throw new IllegalArgumentException("Invalid sales!");
		}
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public void setCommissionRate(double rate) {
		if (rate > 0 && rate < 1.0) {
			commissionRate = rate;
		} else {
			throw new IllegalArgumentException("Invalid commision rate!");
		}
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	
	
	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
			"commission employee", firstName, lastName,
			"social security number", socialSecurityNumber,
			"gross sales", grossSales,
			"commission rate", commissionRate );
	}
	
		
	
	
	
} 
