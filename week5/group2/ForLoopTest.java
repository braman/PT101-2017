class ForLoopTest {
	public static void main(String args[]) {
		//for (;;); // equal to while (true);
		boolean b = false;
		for (int i=0, j = 1;!b && i<j;i++, j++) {
			System.out.println(i +  ", " + j);
		}
		
		int j = 1;
		int i = 0;
		
		while (!b && i < j) {
			System.out.println(i +  ", " + j);
			i++;
			j++;
		}
	}
}
