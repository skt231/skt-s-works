package bae02_class;

import java.util.Scanner;

public class Seqsearch {
	private static int result;
	private static int reuslt;

//요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		System.out.println("검색할 값 : "); // 키값을 입력
		int ky = scan.nextInt();

		int idx = seqSearch(x, num, ky); // 배열x에서 키값이 ky인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
		}

	}

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n) {
				return -1;
			} else if (a[i] == key) {
				return i;

			}
			i++;
		}
		//for문으로 변환--수정 필요
		// 배열a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형검색
//		for (int j = 0; j < n; j++) {
//			int ruselt = 0;
//			if (a[j] == key) {
//				result = j;	//검색성공(엔덱스반환)
//			} else {
//
//				result = -1;	//검색 실패(-1을 반환)
//			}
//		}
//		return reuslt;
	}
}
//배열을 검색할 때 배열 요소의 인덱스를 가리키는 변수는 i
//i가 0으로 초기화하고 요소를 하나 검색할떄마다 while문이 제어하는 루프 본문의 끝에서 증가시킨다.
//while문을 빠져나가는 경우 앞에서 살펴본 종료조건 가운데 하나가 성립하는 경우이다.
//1.i==n이 성립하는 경우(종료 조건1: 검색 실패이므로 -1을 반환)
//2.a[i]==key 성립하는 경우(종료 조건2: 검색성공이므로 i를 반환)