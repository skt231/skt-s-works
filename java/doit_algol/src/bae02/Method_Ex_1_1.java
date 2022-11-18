package bae02;

import java.util.Scanner;

public class Method_Ex_1_1 {

	private static int sumof(int a , int b) {
		int sum=0;
		for(int i=a;i <= b;i++){
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰 수를 입력하세요");
		int a=scan.nextInt();
	
		System.out.println("두번쨰 수를 입력하세요");
		int b=scan.nextInt();
		
		System.out.println ("두수 사이의 모든 정수의 총합은 " + +sumof(a, b)+"입니다.");
	}
}