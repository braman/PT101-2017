public class Example1 {
	
	public static void main(String args[]) {
		int A = 10 * 5 % 2 - 1/2;
		System.out.println("A=" + A);
		
		int B = ++A % 2 - A++ / 10;
		System.out.println("B=" + B);
		
		int C = B + (B--) + (++B); //3 - bonus: why so?
		System.out.println("C=" + C);
		
		
	}
	
} 
