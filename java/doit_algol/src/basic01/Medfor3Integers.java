package basic01;

import java.util.Scanner;

public class Medfor3Integers {
	static int med;
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				med= b;
			} else if (a <= c)
				med= a;
		} else {
			med= c;
		}
		if (a > c) {
			if(c>b) {
				med= c;
			}else if (b>a) {
				med= b;
			} else {
				med= c;
			} if(b>c) {
				if(a>b) {
					med= b;
				}else if (c>a) {
					med= a;
				}
			}
		}
		return med;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("세정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = scan.nextInt();
		System.out.println("b의 값 : ");
		int b = scan.nextInt();
		System.out.println("c의 값 : ");
		int c = scan.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");

	}

}
