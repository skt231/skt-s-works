package basic01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 최댓값을 구합니다.
public class MaxFor3Integers_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();

		int max = a; // 최댓값
		if (max < b) { // b가 max보다 크다면
			if (c < b) { // b가 c보다 큰경우
				System.out.println("b가 제일 큽니다.");
				max = b;
			} else {
				max = c;
			}
		} else if (max < c) { // c가 max보다 크다면
			if (b < c) {
				System.out.println("c가 젤 큽니다.");
				max = c;
			} else {
				max = b;
			}

		}
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
