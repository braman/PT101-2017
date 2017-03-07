class Person {

	private static int counter = 0;

	
	private String name;
	private String surname;
	private int age;
	
	private Department department;
	private Salary salary;
	private Place lastVisitPlace;
	
	public Person() {
		counter++;
	}

	//get and set for Department, Salary and Place

	
	public String getName() {
		//do whatever
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCounter() {
		return counter;
	}

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
} 
