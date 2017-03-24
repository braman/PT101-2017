class InitArray{
	
	public static void main(String args[]) {
		int[] array;
		
		array = new int[10];
		
		System.out.printf("%s\t%s\n", "Index", "Item");
		
		for (int i=0;i<array.length;i++) {
			System.out.printf("%3d\t%3d\n", i, array[i]);
		}
		
		System.out.println();
		
		int n[] = {8,7,6,5,4,3,2,1};
		
		System.out.printf("%s\t%s\n", "Index", "Item");

		for (int i=0;i<n.length;i++) {
			System.out.printf("%3d\t%3d\n", i, n[i]);
			
		}
		
		int[] b;
		
		if (args.length > 0) {
			b = new int[args.length];
		} else {
			b = new int[0];
		}
		
		System.out.printf("%s\t%s\n", "Index", "Item");

		for (int i=0;i<b.length;i++) {
			b[i] = Integer.parseInt(args[i]);

			System.out.printf("%d\t%d\n", i, b[i]);
		}
		
		
	}
} 
