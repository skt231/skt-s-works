package bae02;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값을 나타낸다.(값을 난수로 생성)
public class MaxOfArrayRand {

	public static void main(String[] args) {
		Random rand= new Random();
		Scanner scan= new Scanner(System.in);
		
		System.out.print("사람수 : ");
		int num = scan.nextInt();	//입력한 num의 수를
		int[] height=new int[num];	//바탕으로 배열수를 만듬
		
		for(int j=0;j<height.length;j++) {
			height[j]=rand.nextInt(100)+100;	//100까지 의 난수 +100
			System.out.println("height[ "+j+"] : "+height[j]);
		}
		System.out.println("최댓값 : "+ maxOf(height));

	}
	static int maxOf(int[] a) { //배열a의 최댓값을 구하여 반환한다.
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max =a[i];
			}
		}
		
		return max;
		
	}

}
