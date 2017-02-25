class MaxFinder {

	public int maximumLongWay(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (a > b && a < c) {
			return c;
		} else if (b > a && b > c) {
			return b;
		} else if (b > a && b < c) {
			return c;
		} else if (c > a && c > b) {
			return c;
		} else {
			return c;
		}
		
	}

	public int maximum(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		return max;
	}

	public static void main(String args[]) {
		MaxFinder mf = new MaxFinder();
		int result = mf.maximum(3,1,2);
		
		System.out.println("maximum of 1, 2 and 3 is " + result);


	}
}
