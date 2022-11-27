package four;

public class Java05_operationpostprefix {

	public static void main(String[] args) {
		// 2중for문과 break;
		for(int i = 0; i<10;i++) {
			for(int j =0;j<10;j++) {
				System.out.println("현재 i는 "+i+"j는 "+j);
				if(j>=2);
				//가장 가까은 반복문에서 강제 종료
				break;
			}
		}
		int i=-100;
//		int result =-1*(-100);
//부호연산자는 변수 앞에 부호를 붙히는 것
//부호를 붙히는 것은 부호1 곱셈과 같다 (ex)-1*변수명)
		int result = -1*i;
		System.out.println(result);
		
		int j =0;
		//후위연산자(연산자(+)가 뒤에 있는 것을 말함)
		//전위연산자(연산자(+)가 앞에 있는 것을 말함)
		++i;//i=i+1 같음
		System.out.println(i);	
	}
}
//단황연산자(피 연산자(변수)가 하나인것)/상황연산자(?true:false)
//전위연산자,후위연산자
//오버플로우
