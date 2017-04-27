class HourlyEmployee extends Employee {
	
	private double wage;
	private double workedHours;
	
	public HourlyEmployee(String firstName, String lastName, 
		String socialSecurityNumber, double wage, double workedHours) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		setWage(wage);
		setWorkedHours(workedHours);
		
	}
	
	public void setWage(double wage) {
		if (wage >= 0) {
			this.wage = wage;
		} else {
			throw new IllegalArgumentException("Invalid wage!");
		}
	}
	
	public double getWage() {
		return wage;
	}
	
	public void setWorkedHours(double hours) {
		if (workedHours >=0 && workedHours <= 168) {
			workedHours = hours;
		} else {
			throw new IllegalArgumentException("Invalid hours!");
		}
	}
	
	public double getWorkedHours() {
		return workedHours;
	}
	
	public double earnings() {
		if (workedHours <= 40) {
			return wage * workedHours;	
		} else {
			double noExtra = 40 * wage;
			double extra = (workedHours - 40) * wage * 1.5;
			
			return noExtra + extra;
		}
	}
	
	public String toString() {
		return String.format("hourly employee: %s\nwage: %,.2f\nworked hours: %,.2f",
			super.toString(),
			getWage(),
			getWorkedHours()
		);
	}
	
} 
