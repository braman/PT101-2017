/* Raman Buzaubakov */
public class Triangle {

	public static void main(String args[]) {		
		int a = 10;
				
		for (int j=0;j<a;j++) {
			System.out.println();
			for (int i=0;i<a;i++) {
				if (j == 0) {
					System.out.print("*");		
				} else if (i == 0 || i == a-j-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}