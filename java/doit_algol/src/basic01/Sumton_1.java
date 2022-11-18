package basic01;

import java.util.Scanner;

public class Sumton_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = scan.nextInt();

		int sum = 0;
		int i = 1;

		while (1 <= n) {
			sum += i;// sum에 i를 더한다.
			i++; // i값을 1만큼 증가시킵니다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
