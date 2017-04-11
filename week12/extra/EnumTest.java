import java.util.EnumSet;

class EnumTest{
	
	public static void main(String args[]) {
		
		for (Book b: Book.values()) {
			System.out.println(b);
			
		}
		
		System.out.println();
		
		for (Book b: EnumSet.range(Book.JHTP, Book.CPPHTP)) {
			System.out.println(b);
		}	
		
	}
	
} 
