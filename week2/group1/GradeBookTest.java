import java.util.Scanner;

public class GradeBookTest {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter course name:");
		String courseName = in.nextLine();
	
		GradeBook gradeBook = new GradeBook();
		
		gradeBook.setCourseName(courseName);
		
		gradeBook.displayMessage();
		
		System.out.println("Testing course name:" + gradeBook.getCourseName());
	}
}