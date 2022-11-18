package bae02;

import java.util.Scanner;

//배열 요소에 값을 읽어 들여 역순으로 정렬한다.
public class ReverseArray {
	// 배열요소a[idx1]과 a[idx2]의 값을 바꾼다.
	static void swap(int[] a, int idx1, int idx2) {//t는 임시보관변수
		int t = a[idx1];		//t와 idx1을 교환
		a[idx1] = a[idx2];		//idx1과 idx2를 교환
		a[idx2] = t;			//idx2와 2를 교환
	}

	static void reverse(int[] a) {	
		//a[0]광 a[6]을 교환/a[1]과 a[5]/a[2]과 a[4] 을 교환
		//(교환 횟수=요소갯수/2,홀수일경우 가운데 교환필요x)

		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("요솟수 : ");
		int num = scan.nextInt(); // 요솟수

		int[] x = new int[num];		//배열 초기화

		for (int i = 0; i < x.length; i++) {	//배열 출력
			System.out.println("x[" + i + "] :");
			x[i] = scan.nextInt();		//배열 입력
		}
		reverse(x); // 배열a의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}

}
