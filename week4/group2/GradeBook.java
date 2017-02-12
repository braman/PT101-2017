import java.util.Scanner;


//from https://github.com/braman/PT101-2017/
public class GradeBook {

	private String courseName;

	public GradeBook(String courseName) {
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
				
		while (gradeCounter <= 10) {
			System.out.println("Enter grade: ");
			grade = in.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}

		average = total / 10;
		
		System.out.printf( "\nTotal of all 10 grades is %d\n", total );
		System.out.printf( "Class average is %d\n", average );
		
	}
}