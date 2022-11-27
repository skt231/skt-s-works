package three;

public class Java04_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 4 byte
		//double 8byte: int보다 더 많은 숫자를 표현할수 있음
		
		//변수의 선언부는 바꿀수 없지만,(정적 타입선언)
		//데이트는 이동이 가능하므로 형변환(casting)이 존재
		
		
		//캐스팅x 강제캐스팅ㅇ  double >int
		int intDatacasting = 1000;
		double doubleDataCasting = 990;
		intDatacasting = (int)doubleDataCasting;
				//double 영역이 int영역보다 크므로,
				//int영역에서 double 데이터영역을 포함하지 못하여 에러가 발생
				//강제 캐스팅을 할 경우 캐스팅 대상타입(int)에서 벗어난 데이터일 경우
				//손실 발생위험있음
				//(int)문구작성으로 double데이터를 int타입 변수에 강제적으로 할당
		
		//자동 캐스팅 int >double
		int intData =1000;
		double doubleData = 990;
		System.out.println(intData);
		System.out.println(doubleData);
		//intData 변수에 할당된 1000을 대입연산자(=)를 통해 doubleData 변수에 저장(할당)
		doubleData = intData;//int >double
		System.out.println(doubleData);
	}

}