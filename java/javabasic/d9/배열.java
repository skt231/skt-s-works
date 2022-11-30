package d9;



public class 배열 {

	public static void main(String[] args) {
		// 숫자 1부터 5까지 저장하는 고정배열을 만드시오
		// 고정배열 ㅣ 배열의 길이가 정해진 것
		//배열:1,2,3,4,5,
		int intA =1;
		int intB =2;
		int intC =3;
		int intE =4;
		int intF =5;
		
		//int타입으로배열(여러개 담을수 있는)[]선언
		//이름은 intList
		//=(대입연산자) 우측 항에 int[]타입으로 새로 독립접으로 생성
		//길이는 5>>int[5];
		int[] intList =new int[5];
		
		
		//메모리에 있는 intList배열 변수를 가져다가
		//[0]0번째 있는 배열 순서에
		//=(대입연산자)를 통해 1이라는 숫자를 할당(저장)
		intList[0]= 1;//0부터 시작//2진수가 0부터 시작이니까
		intList[1]= 2;
		intList[2]= 3;
		intList[4]= 4;
		intList[5]= 5;
		
		//숫자 1부터 5까지 저장하는 고정배열을 만드시오
		//A.length: 배열A[]의 길이를 반환해주는 코드
		for(int i = 0; i <intList.length;i++) {
		System.out.println(intList[i]);
		}
	}
}

	


