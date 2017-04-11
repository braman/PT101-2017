class Date {
	
	private int month;
	private int day;
	private int year;
	
	
	private static final int[] daysPerMonth = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = checkMonth(month);
		this.day = day;
	}
	
	public int checkMonth(int month) {
		if (month >=1 && month <= 12) {
			return month;
		} else {
			throw new IllegalArgumentException("Invalid month!");
		}
	}
	public int checkDay(int day) {
		if (day > 0 && day <= daysPerMonth[month]) {
			return day;
		}
		
		if (month == 2 && day == 29 && 
			(year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0))) {
			return day;		
		}
		
		throw new IllegalArgumentException("Invalid day!");
	}
	
	public int checkYear(int year) {
		if (year > 0) {
			return year;
		} else {
			throw new IllegalArgumentException("Invalid year!");
		}
	}

	
	
	public String toString() {
		return String.format("%02d.%02d.%02d", day, month, year);
	}
} 
