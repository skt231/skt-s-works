package d9;

import java.util.Scanner;

public class 메모리의stack과heap과new연산자 {

	public static void main(String[] args) {
		// 1부터 5까지 저장하는 고정배열을 만드시오
		
		//0,1,2,3
		//자료형(클래스) 변수이름 = new자료형(클래스)();
		//stack영역과 heap영역 중요
		//1.int와 같이 앞에 소문자이면 기본타입으로 변수 안에 값을 저장/대문자이면 참조영역
		//대문자인 참조 타입영역은 heap에 있는 주소를 가져온다.
		//2.String과 같은 앞의 대문자이면 같은 데이터일 경우 같은 주소를 가짐
		//3. 단 new라고 붙이면 독립적인 메모리 영역을 할당하여 사용
		//new 연산자와 리터럴 방식의 차이
		int[] saveNumber =new int[4];
		String testString =new String("김준석");
		Scanner testScan = new Scanner(System.in);
		String testString_2 =new String("김준석");
		String testString_3 ="김준석";
		String testString_4 ="김준석";
		
		//system.identityHashCode 메모리 주소를 반환해주는 메서드
		//메모리 주소란 메모리영역을 알수 있는 번지수(진짜 주소)
		
		System.out.println(testString);
		System.out.println(System.identityHashCode((testString)));
		System.out.println(System.identityHashCode((testString_2)));
		System.out.println(System.identityHashCode((testString_3)));
		System.out.println(System.identityHashCode((testString_4)));
		
		//숫자 1부터 100까지 저장하는 고정배열을 만드시오
		//int[] int타입으로 [] 배열선언, 변수이름은 intList_100
		//=(대입연산자) 우측에 int[100] intx타입으로 100개를 넣을수 있는
		// 도구를 새로( new)만들어서 intList_100변수에 할당(저장)***
		
		int[] intList_100 = new int[100];
		
		//for()반복문
		//int i=0;
		//조건절:i의 값은 intList_100.length(길이를 측정하는 도구)***
		//길이보다 작을 때까지 for문을 돌리겠다.
		//i++: 증감식(후위연산자)
		for(int i=0;i<intList_100.length;i++) {
			intList_100[i] =i+1;
		}//intList_100[i]: 배열의 i번쨰를 가져와서
		//=(대입연산자)를 통해 i=1의 값을 저장
		for(int i=0;i<intList_100.length;i++) {
			//intList_100[i]: 배열의 i번째 값을 출력한다.
			System.out.println(intList_100);//
			//intList[0]~intList[99]=100
		}
		int checkInt=0;
		//checkInt=0;//선언부= 할당부//할붕부가 없으면 에러가남
		//String checkString;
		//String
		//숫자1 부터 45까지 숫자를 랜덤으로 뽑아서
		//저장하는 고정배열을 만드시오
		
	}

}
