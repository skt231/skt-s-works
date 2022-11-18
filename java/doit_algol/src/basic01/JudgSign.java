package basic01;

import java.util.Scanner;

public class JudgSign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}

	}

}
