public class GradeBookTest {
	
	public static void main(String args[]) {
		//GradeBook gradeBook = new GradeBook("PT101");
		SentinelGradeBook gradeBook = new SentinelGradeBook("PT101");
		
		gradeBook.displayMessage();
		gradeBook.determineClassAverage();
	}
}