class Dog extends Animal {
	
	public Dog() {
		super("Bob");
		type = "dog";
	}
	
	@Override
	public void test2() {
		System.out.println("Testing dogs...");
	}
	 
} 
