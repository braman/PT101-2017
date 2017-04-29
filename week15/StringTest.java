public class StringTest {
	
	
	public static void main(String args[]) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = s1;
		
		if (s1 == s2) {
			//True?
			System.out.println("s1 == s2!");
		} 
		
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 are equal!");	
		}
		
		String text = "Pay me 0 money";
		
		String textUpdated = text.replace("0", "1000");
		
		System.out.println(text);
		System.out.println(textUpdated);
		
		
		/*
		substring
		indexOf
		charAt
		equals
		compareTo
		lastIndexOf
		length()
		startsWith
		contains
		*/
		
			
		
	}

}