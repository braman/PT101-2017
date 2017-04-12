enum Book {
	
	JHTP("Java How To Program", "2012"), 
	CHTP("C How To Program", "2007"), 
	IW3HTP("Internet & World Wide Web How To Program", "2008"), 
	CPPHTP("CPP How To Program", "2012"), 
	VBHTP("Visual Basic How To Program", "2011"), 
	CSHARPHTP("C-SHARP How To Program", "2011");
	
	private String title;
	private String copyrightYear;
	
	Book (String title, String copyYear) {
		this.title = title;
		this.copyrightYear = copyYear;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}
	
} 
