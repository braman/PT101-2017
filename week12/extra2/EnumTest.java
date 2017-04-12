class EnumTest {
	
	public static void main(String args[]) {
		
		Book e1;
		e1 = Book.JHTP;
		
		System.out.printf("%s, %s\n\n", e1.getTitle(), e1.getCopyrightYear());
		
		Book allBooks[] = Book.values();
		
		for (Book b: allBooks) {
			System.out.printf("%s, %s\n", b.getTitle(), b.getCopyrightYear());
		}
	}
	
} 
