public class GradeBookTest {
	
	public static void main(String args[]) {
		int grades[] = {80, 10, 50, 70, 77, 90, 91, 100};
		
		GradeBook gradeBook = new GradeBook("PT101", grades);
		
		gradeBook.displayMessage();
		gradeBook.processGrades();
	}
}