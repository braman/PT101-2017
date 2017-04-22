class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, 
		String socialSecurityNumber, double weeklySalary) {
		
		//MUST CALL SUPER CONSTRUCTOR FIRST
		super(firstName, lastName, socialSecurityNumber);
		//AND THEN DO OTHER STAFF
		setWeeklySalary(weeklySalary);
	}
	
	public void setWeeklySalary(double salary) {
		if (salary >= 0) {
			weeklySalary = salary;
		} else {
			throw new IllegalArgumentException("Invalid salary!");
		}
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f",
			super.toString(),
			"weekly salary",
			getWeeklySalary()
		);
	}
	
} 
