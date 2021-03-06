public class BasePlusCommissionEmployee extends Object {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	
	public BasePlusCommissionEmployee(String firstName, String lastName, 
		String ssn, double sales, double rate, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = ssn;
		
		setGrossSales(sales);
		setCommissionRate(rate);
		setBaseSalary(salary);
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
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setGrossSales(double sales) {
		if (sales >= 0) {
			grossSales = sales;		
		} else {
			throw new IllegalArgumentException("Invalid sales!");
		}
	}
	
	
	public void setCommissionRate(double rate) {
		if (rate >=0 && rate < 1.0) {
			commissionRate = rate;
		} else {
			throw new IllegalArgumentException("Invalid commision rate!");
		}
	}
	
	public void setBaseSalary(double salary) {
		if (salary >= 0) {
			baseSalary = salary;
		} else {
			throw new IllegalArgumentException("Invalid base salary!");
		}
	}
	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f\n",
			"Commission employee", firstName, lastName,
			"Social security number", socialSecurityNumber,
			"gross sales", grossSales,
			"commission rate", commissionRate,
			"base salary", baseSalary
		);
	}
	
} 







