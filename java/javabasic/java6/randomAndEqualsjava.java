package d6;

public class randomAndEqualsjava {

	public static void main(String[] args) {
		//랜덤숫자를 출력하는 메서드 Math.random(); 의 결과는 소수점이기 때문에
		//double 타입 num 변수를 선언하고 0을 num변수 메모리에 저장
//		double num =0;
		//초기실 i =0; 조건식 i<10; 증감식 ㅑ++(for문 한 번 돌때마다 1씩 i증가)
		for(int i =0;i<10;i++) {
			//0.0보다 크거나 같고 1.0보다 작은 값 출력
			//0.0~0.999 곱하기 10,1000하면
			//0.0~9.999,9.0.0~99.999
			//메모리 num이라는 변수에다가 Math.random()메서드로 실행한 값을 저장
			//Math.random(); 소수점 표기한
			//0.0보다 크거나 같고 1.0보다 작은 값 출력(0.99999..)
			//(int)로 형변환(캐스팅)을 하면 소수점이 다 짤려서 출력 =0
			//num이 double타입이기때문에 0을 0.0으로 형변화(캐스팅)하여 
			//num에 저장
	//		num = Math.random()*100;
//			num =(int)Math.random()*100+1;//int와 math사이에 *가 숨어있음->(int)*Math가 우선으로 계산
//			System.out.println(num);
			int num1 = (int)(Math.random()*45)+1;
			System.out.println(num1);
		}



}
}