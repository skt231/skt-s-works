package d19;

public class No1Student {

	public static void main(String[] args) {
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
		
		int i = topIndex(scores);
		
		System.out.printf("1등 : %s(%d점)\n", names[i], scores[i]);
	}

	public static int topIndex(int[] arr) {
		int result = 0;
		
		for(int i = 1; i<arr.length; i++) {
			result = arr[i]>arr[i-1]?i:i-1;
		}
		
		return result;
		
	}
}