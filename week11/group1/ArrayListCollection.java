import java.util.ArrayList;


class ArrayListCollection {
	
	
	private static void printList(ArrayList<String> array1) {
		for (String a: array1) {
			System.out.printf("%s ", a);
		}
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		ArrayList < String> items = new ArrayList <String> ();		
		
		
		System.out.println("size of list:" + items.size());
		
		items.add("Nurzhan");
		items.add("Nurzhan");
		items.add("Nurzhan");
		items.add("Nurzhan");
		items.add("Nurzhan");
		
		System.out.println("size of list:" + items.size());
		
		printList(items);
		
	}
	
} 
