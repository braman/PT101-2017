class BooleanLogicTest {
	
	public static void main(String args[]) {
		
		int age = 33;
		char gender = 'M';
		
		
		if (gender == 'M' || age >= 20 || age <= 40) {
			System.out.println("Condition holds");
		} else {
			System.out.println("Condition doesn't hold!");
		}
		
	}
}
