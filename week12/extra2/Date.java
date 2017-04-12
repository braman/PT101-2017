class Date {
	
	private int year;
	private int month;
	private int day;
	
	private static final int[] daysPerMonth = // days in each month
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date(int year, int month, int day) {
		this.year = checkYear(year);
		this.month = checkMonth(month);
		this.day = checkDay(day);
	}
	
	public int checkDay(int day) {
		if (day > 0 && day <= daysPerMonth[month]) {
			return day;
		}	
		
		if (month == 2 && day == 29 && (year % 400 == 0 || 
			(year % 4 == 0 && year % 100 != 0))) {
			return day;		
		}
		
		throw new IllegalArgumentException("Invalid day!");
	}
	
	
	public int checkMonth(int month) {
		if (month > 0 && month <= 12) {
			return month;
		}
		
		throw new IllegalArgumentException("Invalid month!");
	}
	
	public int checkYear(int year) {
		if (year > 0) {
			return year;
		}
		
		throw new IllegalArgumentException("Invalid year!");
	}
	
	public String toString() {
		return String.format("%02d/%02d/%04d", day, month, year);
	}
	
	
	
	
	
	
	
	
} 
