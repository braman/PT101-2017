class AndTest {
	
	public static boolean condition1(int age) {
		System.out.println("executing condition1");
		
		
		return age >= 30;
	}
	public static boolean condition2(int age) {
		System.out.println("executing condition2");
		
		return age <= 40;
	}
	
	public static boolean condition3(char gender) {
		System.out.println("executing condition3");
		
		return gender == 'M';
	}
	
	public static void main(String args[]) {
		
		int age = 33;
		char gender = 'M';

		boolean result1 = condition1(age);
		boolean result2 = condition2(age);
		boolean result3 = condition3(gender);
		
		
		
		if (result1 | result2 | result3) {
			
			System.out.println("Condition holds!");
			
			
		} else {
			System.out.println("Condition doesn't hold!");
		}
		
	}
	
	
	
	
}
