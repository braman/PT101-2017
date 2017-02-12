import java.util.Scanner;

public class SentinelGradeBook {
	
	private String courseName;

	public SentinelGradeBook(String name) {
		courseName = name;
	}
	
	public void displayMessage() {	
		System.out.printf("Welcome to the %s!\n", courseName);
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void determineClassAverage() {
		Scanner input = new Scanner(System.in);
		int total;
		int gradeCounter;
		int grade = 1;
		int average;
		
		total = 0;
		gradeCounter = 1;
		
		
		while (true) {
			
			System.out.println("Enter grade: ");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			if (grade < 0) {
				break;
			}
			
		}
			
		average = total / 10;

		System.out.printf( "\nTotal of all 10 grades is %d\n", total );
		System.out.printf( "Class average is %d\n", average );
		
		
		
	}
	
}