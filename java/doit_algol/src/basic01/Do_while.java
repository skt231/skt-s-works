package basic01;

import java.util.Scanner;

//,12,3,....n의 합을 구합니다.(양수만 입력)
public class Do_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 N까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값 : ");
			n= scan.nextInt();
		} while(n<=0);	//	n이 0보다 클때까지 반복합니다.
		
		int sum = 0;	//합
		
		for (int i =0 ; i<= n; i++) {
			sum +=i;
			
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		}

	}

}
//사전판단반복 (while문/for문)과 사후판단(do문)의 차이:
//사전판단반복: 루프문이 실행되지 않음
//사후판단반복: 루프문이 반드시 한번은 실행된다. 그래서 잘안씀