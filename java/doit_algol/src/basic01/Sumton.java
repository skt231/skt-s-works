package basic01;

import java.util.Scanner;

//1부터 n까지의 합을 구하자
public class Sumton {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("n까지의합? n: ");
			int n = scan.nextInt();

			int sum = 0;
			for (int i = 1; i < n+1; i++) {
				sum = i + sum; 	//sum += i
			}
			System.out.println("n까지의 총합은 " + sum + "입니다.");
			System.out.println("---------------------------");
		}

	}
}
