class Time2 {
	
	private int hour;
	private int minute;
	private int second;


	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public Time2(Time2 t) {
		this(t.getHour(), t.getMinute(), t.getSecond());
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int hour) {
		if (isValidHour(hour)) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException("Invalid hour passed!");
		}
	}
	
	public void setMinute(int minute) {
		if (isValidMinute(minute)) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException("Invalid minute passed!");
		}
		
	}
	
	public boolean isValidSecond(int second) {
		if (second >= 0 && second < 60) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidHour(int hour) {
		if (hour >= 0 && hour < 24) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isValidMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			return true;
		} else {
			return false;
		}
	}

	
	public void setSecond(int second) {
		if (isValidSecond(second)) {
			this.second = second;
		} else {
			throw new IllegalArgumentException("Invalid second passed!");
		}
	}
	
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	
	
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", 
			hour, minute, second);
	}
	
}  
