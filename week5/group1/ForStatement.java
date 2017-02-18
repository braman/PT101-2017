public class ForStatement  {
	
	public static void main(String args[]) {
		
		//for (;;); //equals to while (true);
		
		/*
		for (int i=0, j=0;i*j++<=100;i+=j/10, j%=10) {
			System.out.println("i=" + i + ",j=" + j);
		}
		*/
		/*
		for (int i=0;i<10;i+=3) {
			System.out.println("i=" + i);
		}	
		*/

		for (int i=2;i<100;i*=i) {
			System.out.println("i=" + i);
		}
		
		
	}
	
}
