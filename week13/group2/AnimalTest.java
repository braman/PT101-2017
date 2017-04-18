class AnimalTest {
	
	public static void main(String args[]) {
		
		Animal a = new Animal();
		
		System.out.printf("type is %s\n", a.type);
		a.test();
		
		System.out.println();
		
		Dog d = new Dog();
		
		System.out.printf("type is %s\n", d.type);
		
		d.test();
	}
	
} 
