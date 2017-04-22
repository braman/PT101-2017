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
		return String.format("%s %s\n%s: %.2f\n",
			"base-salaried ", super.toString(),
			"base salary", baseSalary
		);
	}
	
} 







