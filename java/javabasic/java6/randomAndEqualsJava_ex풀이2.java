package d7;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class randomAndEqualsJava_ex풀이2 {

	public static void main(String[] args) {
		// 랜덤 숫자 1~10까지 중에 3개의 숫자를 뽑습니다. 그 숫자 중에 가장 큰 수를 출력하시오
		
		//랜덤으로 숫자를 3개를 넣겠다.
		int randomResultValue_1=0;
		int randomResultValue_2=0;
		int randomResultValue_3=0;
		
		//랜덤함수의 값을 저장하는 변수
		int randomNum=0; 
		
		for(int i =0; i<3;i++) {
			//=(대엽연산자) 우측에 연산내용
			//Math.random();JVM에서 제공하는 내장 메서드로
			//실행을 하면0.0~0.99999.. 숫자가 랜덤으로 출력
			//Math.random()*10;
			//0.0 * 10 ~0.9999.. *10:
			//(int)0~9까지 출력(랜덤)
			//0.0 *10 = 0(0하고 곱하면 무조건 0)
			//*10=
			randomNum = (int)(Math.random()*10)+1;
			System.out.println(randomNum);	//for을 사용한 경우
			
			if(randomResultValue_1 ==0) {
				randomResultValue_1 = randomNum;
			} else if(randomResultValue_2 ==0) {
				randomResultValue_2 = randomNum;
			}else if(randomResultValue_3 ==0) {
				randomResultValue_3 = randomNum;	//if를 사용한 경우
		}
	}
		System.out.println("중에 ");
		randomResultValue_1 = (int)(Math.random()*10)+1;
		randomResultValue_2 = (int)(Math.random()*10)+1;
		randomResultValue_3 = (int)(Math.random()*10)+1;
		
		if(randomResultValue_1 > randomResultValue_2) {
			if(randomResultValue_1 > randomResultValue_3 ) {
				System.out.println(randomResultValue_1 +"이 크다!");
			}else {
				System.out.println(randomResultValue_3+"이 크다");
			}
		}else { 
			if(randomResultValue_2 > randomResultValue_3 ) {
				System.out.println(randomResultValue_2+"이 크다!");
		}
}
	
	}
	}


