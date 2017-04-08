class Time1Test {
	
	public static void main(String args[]) {
		Time1 t1 = new Time1();
		
		t1.setTime(10, 10, 10);
		
		System.out.println(t1.toUniversalString());
		
		
		
		try {
			t1.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			System.out.println("Something bad happend!");		
		}
		
		System.out.println(t1.toUniversalString());
		
		t1.setTime(10, 10, 10);
		
		System.out.println(t1.toUniversalString());
		
		
	}
} 
