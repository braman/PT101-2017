import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	
	
	public GradeBook(String name) {
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

	public void inputGrades() {
		Scanner input = new Scanner(System.in);
		
		int grade;
		
		System.out.printf( "%s\n%s\n %s\n %s\n",
			 "Enter the integer grades in the range 0-100.",
			 "Type the end-of-file indicator to terminate input:",
			 "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
			 "On Windows type <Ctrl> z then press Enter" );
		
		while (input.hasNext()) {
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			incrementLetterGradeCounter(grade);
		}
		
	}
	
	//API = Application Programming Interface
	
	private void incrementLetterGradeCounter(int grade) {
	
		switch(grade/10) {
			case 10:
			case 9:
				aCount++;
				break;
			case 8:
				bCount++;
				break;
			case 7:
				cCount++;
				break;
			case 6:
				dCount++;
				break;
			
			default:
				fCount++;
			
		}
	
	}
	
	
	public void displayGradeReport() {
		System.out.println( "\nGrade Report:" );
		if (gradeCounter != 0) {
			
			double average = (double) total / gradeCounter;
						
			System.out.printf( "Total of the %d grades entered is %d\n",
				gradeCounter, total );
				System.out.printf( "Class average is %.2f\n", average );
				System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
				"Number of students who received each grade:",
				"A: ", aCount, // display number of A grades
				"B: ", bCount, // display number of B grades
				"C: ", cCount, // display number of C grades
				"D: ", dCount, // display number of D grades
				"F: ", fCount ); // display number of F grades
		} else {
			System.out.println( "No grades were entered" );
		}
	}
}