import java.util.Scanner;


//from https://github.com/braman/PT101-2017/
public class GradeBook {

	private String courseName;
	private double minTotal;
	private double maxTotal;
	
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;	
	
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
	
	public void inputGrades() {
		Scanner in = new Scanner(System.in);
		
		System.out.printf( "%s\n%s\n %s\n %s\n",
			 "Enter the string grades like A,A-,B+,B, etc.",
			 "Type the end-of-file indicator to terminate input:",
			 "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
			 "On Windows type <Ctrl> z then press Enter" );
			 
			 
		while (in.hasNext()) {
			
			String grade = in.nextLine();
			incrementLetterGradeCounter(grade);
			gradeCounter++;
		}	
		
	}
	
	private void incrementLetterGradeCounter(String grade) {
		minTotal += getMinGradeValue(grade);
		maxTotal += getMaxGradeValue(grade);

		switch (grade) {
			case "A": 
			case "A-": aCount++; break;
			
			case "B+": 
			case "B": 
			case "B-": bCount++; break;
			
			case "C+": 
			case "C": 
			case "C-": cCount++; break;
			
			case "D+": 
			case "D": dCount++; break;
			
			default: fCount++;
		}	
	}
	
	private int getMinGradeValue(String grade) {
		switch (grade) {
			case "A": return 95;
			case "A-": return 90;
			case "B+": return 85;
			case "B": return 80;
			case "B-": return 75;
			case "C+": return 70;
			case "C": return 65;
			case "C-": return 60;
			case "D+": return 55;
			case "D": return 50;
			default: return 0;
		}
	}

	private int getMaxGradeValue(String grade) {
		switch (grade) {
			case "A": return 100;
			case "A-": return 94;
			case "B+": return 89;
			case "B": return 84;
			case "B-": return 79;
			case "C+": return 74;
			case "C": return 69;
			case "C-": return 64;
			case "D+": return 59;
			case "D": return 54;
			default: return 0;
		}
	}
	
	public void displayGradeReport() {
		System.out.println("Grade report:");
		
		if (gradeCounter > 0) {
			double minAverage = minTotal / gradeCounter;
			double maxAverage = maxTotal / gradeCounter;
			
			System.out.printf( "Total of the %d grades entered is %d(min) %d(max)\n",
				gradeCounter, (int)minTotal, (int)maxTotal );
			
			System.out.printf( "Min class average is %.2f\n", minAverage);
			System.out.printf( "Max class average is %.2f\n", maxAverage);
			
			System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
				 "Number of students who received each grade:",
				 "A: ", aCount, // display number of A grades
				 "B: ", bCount, // display number of B grades
				 "C: ", cCount, // display number of C grades
				 "D: ", dCount, // display number of D grades
				 "F: ", fCount ); // display number of F grades
			
			
		} else {
			System.out.println("No grades entered! Please enter some...");
		}
	}

}