class StaticTest {
	
	public static void main(String args[]) {
		
		Person p1 = createPerson("John", "Carter", 30);		

		Person p2 = createPerson("Bill", "Gates", 50);		
		
		
		System.out.println("Person's name is: " + p1.getName());
		System.out.println("Person's name is: " + p2.getName());
		
	}
	
	public static Person createPerson(String name, String surname, int age) {
		
		Person p = new Person();
		p.setName(name);
		p.setSurname(surname);
		p.setAge(age);
		
		return p;
	}
	
} 
