class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName,
		String socialSecurityNumber, double wage, double hours) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		setWage(wage);
		setHours(hours);
	}
	
	
	public void setWage(double wage) {
		if (wage >=0 ) {
			this.wage = wage;
		} else {
			throw new IllegalArgumentException("Invalid wage!");
		}
	}
	
	public void setHours(double hours) {
		if (hours >=0 && hours <= 168) {
			this.hours = hours;
		} else {
			throw new IllegalArgumentException("Invalid hours!");
		}
	}
	
	public double getWage() {
		return wage;
	}
	
	public double getHours() {
		return hours;
	}
	
	@Override
	public double earnings() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			double noExtra = wage * 40;
			double extra = wage * (hours - 40) * 1.5;
			
			return noExtra + extra;
		}
	}
	
	@Override
	public String toString() {
		return String.format(
			"hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
			super.toString(),
			"hourly wage",
			getWage(),
			"hours worked",
			getHours()
		);
	}
	
} 
