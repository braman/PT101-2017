class PersonTest {
	
	public static void main(String args[]) {
		Department d = createDepartment(/*some args*/);

	
		Person p = createPerson("Bill", "Gates", 50);
		p.setDepartment(d);
		
		
		System.out.printf("%s works in %s with salary %d. Last travelled place was %s\n",
			p.getName(), p.getDepartment().getName(), p.getSalary().getMonthlySalary(), 
			p.getLastPlace().getCountry());
		
		
		
		System.out.printf("Counter %d \n", p.getCounter());
		
		Person p2 = createPerson("John", "Carter", 30);
		
		System.out.printf("Counter %d \n", p.getCounter());
		
		System.out.printf("Person is %s %s, age is %d\n", 
			p.getName(), p.getSurname(), p.getAge());
		System.out.printf("Person is %s %s, age is %d\n", 
			p2.getName(), p2.getSurname(), p2.getAge());
		
	}
	
	
	public static Department createDepartment() {
		return null;
	}
	
	public static Person createPerson(String name, String surname, int age) {
		Person p = new Person();
		p.setName(name);
		p.setSurname(surname);
		p.setAge(age);
		
		return p;
	}
	
} 
