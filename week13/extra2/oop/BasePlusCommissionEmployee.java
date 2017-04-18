public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	
	public BasePlusCommissionEmployee(String firstName, String lastName, 
		String ssn, double sales, double rate, double salary) {
		super(firstName, lastName, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		if (salary >= 0) {
			baseSalary = salary;
		} else {
			throw new IllegalArgumentException("Invalid base salary!");
		}
	}
	
	public double earnings() {
		return baseSalary + getCommissionRate() * getGrossSales();
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







