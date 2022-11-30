package d9;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;


public class 배열_ex_2 {

	public static void main(String[] args) {
		// 10개의 정수를 입력 받아 가장 큰수 출력
		//2.scanner로 정수를 받는다.
		//3.받은 정수list로 while문_ex_1_for문 돌아가서 가장 큰 수를 찾는다.
		
		//scanner타입으로 scan변수 선언
		//새로(new) Scanner도구를 만들어서 (System.in 키보드와 통로)
		//=(대입연산자)좌측 scan변수에 저장
		
		Scanner scan = new Scanner(System.in);
		
		//int[]int배열 타입으로 intList변수 선언
		//=(대입연산자) 좌측 intList
		int[] intList = new int [5];
		
		//초기식 : i=0;
		//조건식: i는 intList의 길이보다 미만일 때까지
		//증감식 : i++;
		//for문 1번 돌면>i는 1증가> 는 조건식에 부합되는지 확인>다음 for문 실행)
		for(int i=0; i<intList.length; i++) {
			System.out.println("숫자를 입력하시오");
			//scan이라는 변수를 가져와서
			//변수 안에 있는 nextInt()메서드를 실행하면
			//키보드로 전달받은 숫자로
			//intList배열의 i번쨰 공간에 저장
			intList[i] = scan.nextInt();
			
		}
		for(int i=0;i<intList.length;i++) {
			System.out.println(intList[i]);
		}
		//int temp = 0;
		//1.음수 일 경우//가장큰값이 될거임
		int temp=intList[0];
		
		for(int i= 0;i<intList.length;i++) {
			//for문으로 intList 모두 순화
			//intList[i]의 값과 temp값을 비교해서
			//intList[i]값이 크면 temp에 저장한다.
			//= 두개 비교해서 큰값을 temp에 저장하자
			if(temp < intList[i]) {
				temp=intList[i];
				
			}
					
		}
	System.out.println("가장 큰 값 = "+temp);

}
}
