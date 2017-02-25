class StaticMethod {

	public static int MAX = 9999;

	private void sayHello(String message, int n) {
		for (int i=0;i<n;i++) {
			System.out.println(message);
		}
	}

	public static void main(String args[]) {
		StaticMethod sm = new StaticMethod();

		sm.sayHello("Hello", 10);

		
	}
}
