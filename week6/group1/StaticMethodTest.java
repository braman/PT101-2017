class StaticMethodTest {


	public static void main(String args[]) {
		String message = args[0];
		int n = Integer.parseInt(args[1]);

		for (int i=0;i<n;i++) {
			System.out.println(message);
		}
	}
}
