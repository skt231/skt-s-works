package bae02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CloneArray { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner생성
		// 배열을 복제합니다.
		int b[] = new int[5]; // 배열을 생성

		for (int i = 0; i < b.length; i++) { // 각 배열의 값을 입력
			System.out.println("b[" + i + "]에 삽입할 수를 입력하세요");
			b[i] = scan.nextInt();
		}

		int[] c = b.clone(); // c배열에 b배열 복제

		System.out.println("b = "+ Arrays.toString(b)); // 배열 조회
		System.out.println("c = "+ Arrays.toString(c));

	}
}
