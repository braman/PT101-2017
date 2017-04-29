public class PersonTest {

	
	public static void main(String args[]) {
		Person p1 = new Person("Test1", "Test2", 20);	
		
		Person p2 = new Person("Test3", "Test4", 25);	
		
		Person p3 = new Person("Test1", "Test2", 20);	
		
		
		if (p1.equals(p3)) {
			System.out.println("p1 and p2 equals!");
		} else {
			System.out.println("p1 and p2 are not equal!");
		}
		
		
	}

} 