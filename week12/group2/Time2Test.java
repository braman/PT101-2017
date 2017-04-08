class Time2Test {
	
	public static void main(String args[]) {
		
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(5);
		Time2 t3 = new Time2(5, 4);
		Time2 t4 = new Time2(5, 4, 2);
		Time2 t5 = new Time2(t4);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		
		
	}
	
} 
