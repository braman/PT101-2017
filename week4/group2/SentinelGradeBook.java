import java.util.Scanner;


//from https://github.com/braman/PT101-2017/
public class SentinelGradeBook {

	private String courseName;

	public SentinelGradeBook(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}

	public int displayMessage() {
		System.out.printf("Welcome to the %s!\n", courseName);
		return 0;
	}
	
	public void determineClassAverage() {
		Scanner in = new Scanner(System.in);
		
		int total;
		int gradeCounter;
		int grade;
		int average;
		
		total = 0;
		gradeCounter = 1;
		grade = 0;
				
		while (grade > -1) {
			System.out.println("Enter grade: ");
			grade = in.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;			
		}

		average = total / gradeCounter;
		
		System.out.printf( "\nTotal of all 10 grades is %d\n", total );
		System.out.printf( "Class average is %d\n", average );
		
	}
}