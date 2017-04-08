class Time2Test {
	
	public static void main(String args[]) {
		Time2 t = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 20);
		Time2 t4 = new Time2(1, 2, 3);
		Time2 t5 = new Time2(t4);
		
		
		System.out.println(t.toUniversalString());
		System.out.println(t2.toUniversalString());
		System.out.println(t3.toUniversalString());
		System.out.println(t4.toUniversalString());
		System.out.println(t5.toUniversalString());
	
		try {
			Time2 t6 = new Time2(99, 9, 9);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
	
	}
	
	
	
	
}
 
