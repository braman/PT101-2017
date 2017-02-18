import java.util.Scanner;

public class SentinelControlled {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		/*		
		while (input.hasNext()) {
			String someText = input.nextLine();
			System.out.println(someText);
		}
		*/	

		for (String someText = null;input.hasNext();) {
			someText = input.nextLine();
			System.out.println(someText);
		}
				

		
	}
	
}