import java.util.Scanner;

public class Addition {
	
	int i = 0;
		
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = in.nextInt();
		System.out.println("Enter b:");
		int b = in.nextInt();
		int c = a + b;
		System.out.println("A + B = " + c);
	}


}