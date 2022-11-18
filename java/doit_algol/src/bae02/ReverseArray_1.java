package bae02;

import java.util.Arrays;

public class ReverseArray_1 {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 73, 2, -5, 42 };
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------");
		System.out.println("a[0]과 a[5]를 교환합니다.");
		int t = arr[0];
		arr[0] = arr[5];
		arr[5] = t;
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------");
		System.out.println("a[1]과 a[4]를 교환합니다.");
		t = arr[1];
		arr[1] = arr[4];
		arr[4] = t;
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------");
		System.out.println("a[2]과 a[3]을 교환합니다.");
		t= arr[2];
		arr[2]=arr[3];
		arr[3]=t;
		System.out.println(Arrays.toString(arr));
		
		 System.out.println("총합 : "+maxOf(arr));;
	}

	 static int maxOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
		}
		return sum ;

	}
	// 2.배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.

}
