public class GradeBookTest {
	
	public static void main(String args[]) {
		GradeBook gradeBook = new GradeBook("PT101");
		
		gradeBook.displayMessage();
		gradeBook.inputGrades();
		gradeBook.displayGradeReport();
	}
}