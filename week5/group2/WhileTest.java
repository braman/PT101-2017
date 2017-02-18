import java.util.Scanner;

class WhileTest  {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String someText = in.nextLine();
			System.out.println(someText);
		}
		
	}
	
	public static void main2(String args[]) {
		int i = 0;
		
		while (i-- > 0) {
			System.out.println("Test1");
		}
		
		i = 0;
		
		do {
			System.out.println("Test2");
		} while (i-- > 0);
	}
}
