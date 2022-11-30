package d7;

public class randoAndEqualsjava2 {

	public static void main(String[] args) {
		
		// 랜덤숫자를 출력하는 메서드 Math.random(); 의 결과는 소수점이기 때문에
		// double 타입 num 변수를 선언하고 0을 num변수 메모리에 저장
		double exnum = 0;
		int num =0;
		int lotto1 =0;
		int lotto2=0;
		int lotto3=0;
		int lotto4=0;
		int lotto5=0;
		int lotto6=0;
		// 초기실 i =0; 조건식 i<10; 증감식 i++(for문 한 번 돌때마다 1씩 i증가)
		for (int i = 0; i < 6; i++) {
			if(lotto1 ==0) {
				//lotto1 변수에
				//=(대입연산자)를 통해서
				//exNum변수의 값을 가져다가 할당(저장)
				
				//exNum변수에 예를 들어 23이라는 숫자가 있다고 가정한다면, 
				//=(대입연산자) 우측부터 시작하여,
				//exNum벼수를 메모리에서 불러다가 값을 가져온다.
				//23이라는 숫자를 가져와서 ,
				//=(대입연산자) 좌측에 있는 lotto1이라는 변수에 할당(저장)
				lotto1 =num;
			}else if(lotto2 ==0) {
				lotto2 = num;
			}else if(lotto3 ==0) {
				lotto3 = num;
			}else if(lotto4 ==0) {
				lotto4 = num;
			}else if(lotto5 ==0) {
				lotto5 = num;
			}else if(lotto6 ==0) {
				lotto6 = num;
			}
			
			
			
			// 0.0보다 크거나 같고 1.0보다 작은 값 출력
			// 0.0~0.999 곱하기 10,1000하면
			// 0.0~9.999,9.0.0~99.999
			// 메모리 num이라는 변수에다가 Math.random()메서드로 실행한 값을 저장
			// Math.random(); 소수점 표기한
			// 0.0보다 크거나 같고 1.0보다 작은 값 출력(0.99999..)
			// (int)로 형변환(캐스팅)을 하면 소수점이 다 짤려서 출력 =0
			// num이 double타입이기때문에 0을 0.0으로 형변화(캐스팅)하여
			// num에 저장
			// num = Math.random()*100;
//			exnum = (int) Math.random() * 1000 + 1;// int와 math사이에 *가 숨어있음->(int)*Math가 우선으로 계산
			num = (int) (Math.random() * 10 + 1); //숫자가 정상적으로 나옴
//			num = (int) (Math.(random()) * 1000);
//			System.out.println(exnum);
			
}
		System.out.println("로또 번호는 "); 
		System.out.println(lotto1 + "/" + lotto2 +"/" +lotto3 );
		System.out.println(lotto4 + "/" + lotto5 +"/" +lotto6 ); 
	}
}
