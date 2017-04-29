class Person {
	public final String firstName;
	public final String lastName;
	public final int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || 
			!(o instanceof Person)) {
			return false;
		} else {
			Person p = (Person) o;
			if (p.firstName.equals(firstName) &&
				p.lastName.equals(lastName) &&
					p.age == age) {
						return true;
			}
		}
		
		return false;
	}
} 
