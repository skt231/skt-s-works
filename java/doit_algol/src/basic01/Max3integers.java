package basic01;

//3개의 정숫값 가운데 최댓값을 구하여 출력합니다.
public class Max3integers {
	// a,b,c의 최댓값을 구하여 반환합니다.

	static int max(int a, int b, int c) {

		int max = a; // 최댓값
		if (max < b) { // b가 max보다 크다면
			if (c < b) { // b가 c보다 큰경우

				max = b;
			} else {
				max = c;
			}
		} else if (max < c) { // c가 max보다 크다면
			if (b < c) {
				max = c;
			} else {
				max = b;
			}
		}
		return max; // void가 없으므로 return
	}

	public static void main(String[] args) {
		System.out.println("max(3,2,1) = " + max(3, 2, 1)); // a>b>c
		System.out.println("max(3,5,9) = " + max(3, 5, 9)); // a>b>c
		System.out.println("max(3,5,1) = " + max(3, 5, 1)); // a>b>c
		System.out.println("max(5,9,2) = " + max(5, 9, 2)); // a>b>c
		System.out.println("max(9,6,3) = " + max(9, 6, 3)); // a>b>c

	}

}
