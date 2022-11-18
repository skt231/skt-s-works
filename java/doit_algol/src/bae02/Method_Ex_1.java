package bae02;

import java.util.Scanner;

public class Method_Ex_1 {

	public static int sumof(int a , int b) {
		
		return (int)((a+b)*(b-a+1)/2.0f);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰 수를 입력하세요");
		System.out.println("두번쨰 수를 입력하세요");
		System.out.println(sumof(scan.nextInt(), scan.nextInt()));
	}
}