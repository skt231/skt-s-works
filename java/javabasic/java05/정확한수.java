package d5;
//page81
public class 정확한수 {

	public static void exactNum() {
		//2진수로 표현하면 숫자를 정확하게 나타낼수 없다!
		//항상 10진수는[2진수 변환한 뒤에 계산하고] 다시 10진수로 표현
		//2진수 표기후 나머지를 무한대로 출력할 경우
		//타입에 따라 표기할 수 있는 범위의 한도에 의해 소수점 특정자리까지만 표현
		System.out.println(0.1 +0.2);
		
		//int타입으로 apple변수를 선언
		//=(대입연산자) 우측에 있는 1을 좌측  apple변수에 할당(저장)
		int apple = 1;
		int totalPieces = apple *10;
		//double pieceUnit = 0.1;
		double pieceUnit = 0.1;
		int num = 7;
		int temp= totalPieces - num;
		
		//소수점 표기를 정수로 우선 계산하고 다시 소수점 영역으로 변환하면
		//정수로 정확히 계산가능
		
		//double타입으로 result변수이름 선언
		//=(대입연산자) 우측에 apple변수를 메모리에서 가져온 뒤
		//number변수 데이터 와 priceUnit변수 데이터를 곱한 값을 
		//뺀 값을 result변수에 저장 
		double result = apple - num *pieceUnit;
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7조각을 뺴면, ");
		System.out.println(result +"조각이 남는다.");
		

	}

}
