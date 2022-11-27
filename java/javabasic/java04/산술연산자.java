package four;

public class 산술연산자 {


		public static void main(String[] args) {
		int int1=10;
		int int2=4;
		//10나누기 4=2.5
		//int는 정수표현: 소수점 이후는 표현이 불가=2만 출력
		 int result2=int1/int2;
		 //int는 정수표련: 소수점 이후는 표현이 불가= 2만 출력 되고
		 //result3에 2라는 정수를 double로 형변황 하여 변수에 할당
		 double result3=(double)int1/int2;//double타입으로 강제 타입변환해야함
		 
		 System.out.println(result2);
		 System.out.println(result3);

		}

	}