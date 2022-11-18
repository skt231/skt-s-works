package basic01;

import java.util.Scanner;

public class Angled_tirangle {
//왼쪽아래가 직각인 이등변 삼각형을 출력합니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n = ");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
