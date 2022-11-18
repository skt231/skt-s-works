package bae02;

//구성요소의 자료형이 int형인 배열(구성 요솟수는 5:new에 의해 본체를 생성)
public class IntArray {

	public static void main(String[] args) {
		//1)
//		int[] a = new int[5]; // 배열의 선언 요솟수가 5
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
		//2)
//		int[]a=new int[]{1,2,3,4,5};	//정석
		int[] a= {1,2,3,4,5};	
		for (int i = 0; i < a.length; i++) {	//배열 초기자에 의해 생성
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
