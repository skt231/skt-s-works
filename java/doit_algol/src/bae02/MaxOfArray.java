package bae02;

import java.util.Arrays;
import java.util.Scanner;

//배열요소의 최댓값을 나타냅니다.(값을 입력받음)
class MaxOfArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("사람의 수를 입력하세요");
		int num = scan.nextInt(); // 입력받은
		int[] height = new int[num]; // 요솟수가 num인 배열 초기화

		System.out.println("키의 최댓값을 구합니다.");

		for (int i = 0; i < height.length; i++) { // 배열 입력
			System.out.print("height[" + i + "] : ");
			height[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(height)); // 배열 출력
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		// 배열 a의 최댓값을 구하여 반환합니다.

	}

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		return max;
	}
}
