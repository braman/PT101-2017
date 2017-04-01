public class GradeBookTest {
	
	public static void main(String args[]) {

		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
	
		GradeBook gradeBook = new GradeBook("Some CS101", gradesArray);
		
		gradeBook.displayMessage();
		gradeBook.processGrades();
		
	}
}