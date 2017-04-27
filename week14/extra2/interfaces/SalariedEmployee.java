class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(
			String firstName, 
			String lastName, 
			String socialSecurityNumber,
			double weeklySalary) {
		
		//SUPER SHOULD BE CALLED VERY FIRST!!!
		super(firstName, lastName, socialSecurityNumber);
		
		setWeeklySalary(weeklySalary);
	}
	
	public void setWeeklySalary(double salary) {
		if (salary >= 0) {
			weeklySalary = salary;
		} else {
			throw new IllegalArgumentException("Invalid salary");
		}
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return String.format("salaried employee: %s\nweekly salary: %,.2f", 
			super.toString(), 
			getWeeklySalary()
		);
	}
	
	
	
} 
