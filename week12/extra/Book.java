enum Book {
	
	JHTP("Java How To Program"),
	CHTP("C How To Program"), 
	IW3HTP( "Internet & World Wide Web How to Program"),
	CPPHTP( "C++ How to Program"),
	VBHTP( "Visual Basic 2010 How to Program" ),
	CSHARPHTP( "Visual C# 2010 How to Program");

	private String title;
	
	Book(String title) {
		this.title = title;
	}
	
	public String toString() {
		return name() + " " + title;
	}
	
} 
