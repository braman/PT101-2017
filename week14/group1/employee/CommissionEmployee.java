public class CommissionEmployee extends Employee {
	
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, 
		String ssn, double sales, double rate) {
		super(firstName, lastName, ssn);
		
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
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

	@Override	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("%s:  %s\n%s: %.2f\n%s: %.2f",
			"commission employee", super.toString(),
			"gross sales", grossSales,
			"commission rate", commissionRate
		);
	}
	
} 







