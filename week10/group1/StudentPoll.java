class StudentPoll {
	public static void main(String args[]) {
		int[] responses = { 
			1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
			10, 2, 3, 3, 2, 14 };
		
		int frequency[] = new int[6];
		
		for (int answer=0;answer<responses.length;answer++) {
			try {
				++frequency[responses[answer]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.printf("Answer %d is not in the range of possible!\n", responses[answer]);
			}
		}
	}
} 
