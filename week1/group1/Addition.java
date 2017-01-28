public class Addition {
	
	int i = 0;

	public static void main(String args[]) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter a:");
		int a = in.nextInt();
		System.out.println("Enter b:");
		int b = in.nextInt();
		String str = "123";
		int c = a + b;

		System.out.printf("A+B=%d\n", c);
	}
}