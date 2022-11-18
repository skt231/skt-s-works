package basic01;

import java.util.Scanner;

//입력한수를 한변으롷는 정사각형을 *기호로 출력하는 프로그램을 작성하세요
public class Square_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		System.out.println("단수 : ");
		n = scan.nextInt();
		
			for(int j=1;j<=n;j++) {
		System.out.printf("%s%n","*****");

	}
	}
	}

