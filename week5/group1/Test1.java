public class Test1 {
	
	public static void main(String args[]) {
		int b = 1;
		
		System.out.println("b before " + b);
		
		b += 10;
		
		System.out.println("b+= now " + b);
		
		b -= 10;
		
		System.out.println("b-= now " + b);
		
		b *= 10;
		
		System.out.println("b*= now " + b);
		
		b /= 10;
		
		System.out.println("b/= now " + b);
	
		b %= 10;
		
		System.out.println("b%= now " + b);
		
		for (int i = 1; i <= 25; i*=5) {
			System.out.println("Hello");
		}
	
	}
	
	
}
