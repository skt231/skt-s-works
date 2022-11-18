package bae02_class;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

//선형 검색(보초법)
public class seqSearchSen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1]; // 요솟수+1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		System.out.println("검색할 값 : "); // 키값을 입력
		int ky = scan.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 kt인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
		}

	}
//1.검색할 값key를 보초에 a[n]에 대입
//2.배열 요소를 순서대로 검사
	//if(i==n)//종료조건1
	//if(a[i]==key)	//종료조건2
//3.while문에 의해 반복이 완료되면 찾은 값이 배열의 원래 데이터인지 아니면 보초인지 팓나해야함
	//변수i값이n이면 찾은 값이 보초이므로 검색 실패임을 나타내므로 -1을 반환
	// 요솟수가 n인 배열a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key; // 보초를 추가

		while (true) {
			if (a[i] == key) {
				break;
			}
			i++;
		}

		return i == n ? -1 : i;
	}
}
