public class GradeBookTest {
	
	public static void main(String args[]) {
	
		//GradeBook gradeBook = new GradeBook("PT101 Course");
		SentinelGradeBook gradeBook = new SentinelGradeBook("Some CS101");
		gradeBook.displayMessage();
		gradeBook.determineClassAverage();
		
	}
}