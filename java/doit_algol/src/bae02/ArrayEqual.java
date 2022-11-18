package bae02;

import java.util.Arrays;
import java.util.Scanner;

//두 배열이 같은가를 판단
public class ArrayEqual {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scan

		int[] a = new int[5]; // a배열 초기화(생성)
		for (int i = 0; i < a.length; i++) { // a배열 (입력)
			System.out.print("a의 " + i + "번째 숫자 : ");
			a[i] = scan.nextInt();
		}
		System.out.println("-------------------------");

		int[] b = new int[5]; // b배열 초기화(생성)
		for (int i = 0; i < b.length; i++) { // b베열 입력
			System.out.print("b의 " + i + "번째 숫자 : ");
			b[i] = scan.nextInt();

		}
		System.out.println("-------------------------");
		System.out.println("a = " + Arrays.toString(a));// Array.toString 배열 출력
		System.out.println("b = " + Arrays.toString(b));
		System.out.println("-------------------------");

//		if (equals(a, b)) { // true라면
//			System.out.println("같습니다."); // 같습니다. 출력
//		} else { // false라면
//			System.out.println("다릅니다."); // 다릅니다. 출력
//		}
		System.out.println("배열 a와 b는" + ((equals(a, b) ? "일치합니다." : "불일치합니다.")));
//		System.out.println("----------------------------");
//		copy(a, b);		//copy실행
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		System.out.println("----------------------------");

		rcopy(a, b); // rcopy실행
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("----------------------------");
	}

	static boolean equals(int[] a, int[] b) { // equals()클래스
		// 두배열 a,b의 모든 요소가 같은가?
		boolean result = false; // resutl 변수 생성
		if (a.length == b.length) { // a와b의 배열이 같다면 for문으로
			for (int i = 0; i < a.length; i++) { // i가 0부터 a의 배열길이까지
				if (a[i] == b[i]) { // a와b의 요소들 같은지 확인
					result = true; // 모드 같다면 true
				} else { // a와 b의 배열이 다르다면
					result = false; // false
				}
			}
			return result; // 결과값 출력
		} else { // a와b의 배열이 다르다면
			return false; // false
		}
	}

	// 2.배열b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
	static void copy(int[] a, int[] b) { // copy()메서드 생성
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i]; // b값을 a값에 복사
		}

	}

	// 3.배열b의 모든 요소룰 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요.
	static void rcopy(int[] a, int[] b) {
		for (int j = 0; j < b.length / 2; j++) { // b배열을 역순으로 바꿈
			int t = b[j];
			b[j] = b[b.length - j - 1];
			b[b.length - j - 1] = t;
		}
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i]; // b값을 a값에 복사
		}
		for (int j = 0; j < b.length / 2; j++) { // b배열을 정순으로 바꿈
			int t = b[j];
			b[j] = b[b.length - j - 1];
			b[b.length - j - 1] = t;

		}

	}
}
