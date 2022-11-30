package d6;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.function.BiConsumer;

public class ForWhile {

	public static void main(String[] args) {
		studyForWhile();

	}
	public static void studyForWhile() {
		//for문 : 반복문: 특정 값 기준으로 조건이 성립할 떄까지 코드 반복
		//메모리에 sum이라는 변수를 선언하고(타입은 int)
		//0이라는 숫자를 =(대입연산자)를 통해 sum에 할당(저장)
		int sum =0;
		//초기식	: int i =1; i변수 기준으로 1부터 시작한다.
		//조건식	: i<=100; i는 100이하일 떄까지 for문을 실행한다.
		//증감식	: i++; for문 1번 돌 때마다 i는 1씩 증가한다.
		for(int i =1; i<=100;i++) {
			//sum +i; sum이라는 변수를 가져다가 i를 더하여
			//=(대입연산자)를 통해 sum이라는 변수에 할당(저장)
			//sum = sum + i
			//1 = 0 + 1
			//3 = 1 +2
			//6 = 3 + 3
			//10= 6 + 4
			sum =sum +i;
		}
		System.out.println(sum);
		//sum 변수의 값을 0으로 저장
		sum=0;
		int i =1;
		//for문 계속 돌기(조건식 없으므로 무한 돌기)
		for(;;){
			sum = sum + i;
			//if조건이 성립되면 {}안에 break; 코드가 실행 되어
			//가장 가까운 for문을 종료시킴
			if(i>=100) {
				break;
			} else {
				i++;
			}
		}	
	System.out.println(sum);
	
	}
}
	
	
	




