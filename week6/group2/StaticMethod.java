class StaticMethod {
	
	public static final int MAX = 9999;
	
	private void sayHello(String message, int n) {
		for (int i=0;i<n;i++) {
			System.out.println(message);
		}
	}
	
	public static void main(String args[]) {
		StaticMethod sm = new StaticMethod();
		
		sm.sayHello("Hello World", 10);
		
		StaticMethod.MAX = 123;
		
		System.out.println(StaticMethod.MAX);
		
	}
	
}
