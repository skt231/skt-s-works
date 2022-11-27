package four;

//break포인트 -->버그?디버깅?
public class 연습문제1 {
//메인메서드:자바 프로그램의 시작점!
	public static void main(String[] args) {
		examEvenAndOddCustom(30);
	}

	public static void examEvenAndOddCustom(int num) {
		double count = 0;
		double count2multiple = 0;
		double count3multiple = 0;
		double count4multiple = 0;
		double count5multiple = 0;
		// (i가)1부터 30까지 1씩 증가하면서 그숫자가 2,3,4,5의 배수인지 확인하는 for문
		System.out.println("매개변수는 " + num + "입니다.");
		for (int i = 1; i <= num; i++) {
			// (i가)1부터 30까지 증가하면서 그숫자가 2,3,4,5 의 배수인지 확인하는 for문
			if (i % 2 == 0) {
				// i의 숫자가 2의 배수인지 확인(2로 나누어서 나머지가 0이면 2의배수)
				// System.out.println(i + "의 값은 2배수 입니다.");
				count++;
				count2multiple++;
				if (i % 4 == 0) {
					// i의 숫자가 4의 배수인지 확인(4로 나누어서 나머지가 0이면 2의배수)
					// System.out.println(i + "의 값은 2배수 입니다.");
					count++;
					count4multiple++;
				}
			}
			if (i % 3 == 0) {
				// i의 숫자가 3의 배수인지 확인(3로 나누어서 나머지가 0이면 2의배수)
				// System.out.println(i + "의 값은 2배수 입니다.");
				count++;
				count3multiple++;
			}

			if (i % 5 == 0) {
				// i의 숫자가 5의 배수인지 확인(5로 나누어서 나머지가 0이면 2의배수)
				// System.out.println(i + "의 값은 2배수 입니다.");
				count++;
				count5multiple++;
			}
			// (1)
			// //1부터 매개변수 num까지 범위 내에서 = for문 쓰기
			// 2의배수, 3의배수,4의 배수,5의 배수의 경우
			// 각각
			// system.out.prinln(i+"의 값은 ?배수 입니다.!")
			// 믄구를 출력하고, (2)main메서드에서
			// examEvenAndOddCustom return값인 3의 배수, 4의 배수, 5의 배수수의
			// 개수를 double타입의 숫자로 출력하시오
			// (3)
			// 2,3,4,5 의 배수의 갯수 중에 2번 째로 많은 배수의 갯수를 가진 ?배수의 이름을 출력하시오
			// (단, 지금까지 배웠던 내용을 활용하여 작성하세요)
		}
		System.out.println("2의 배수의 개수는 " + count2multiple);
		System.out.println("3의 배수의 개수는 " + count3multiple);
		System.out.println("4의 배수의 개수는 " + count4multiple);
		System.out.println("5의 배수의 개수는 " + count5multiple);

	}

}

//관점:하나의 행동, 물체 모든 것을 다양한 시점으로 보는것
//개발자 관점:코드의 가독성:다른 사람이 본인의 코드를 객관적으로 분석할수 있는가?
//--변수이름:변수 이름으로 변수(메서드,클래스 이름)의 속성을 알 수 있어야 한다.(직관적 구체적으로 써야함)
//--띄어쓰기(코드영역{}을 구분짓고 가독성을 높혀서 본인 코드 보기편하게 수정할것(같은{}는 같은 줄에)
//--조건절,반복문 위치를 전체적으로 볼수 있도록 코드 정렬
//컴퓨터(시스템) 관점:리소스 관리(컴퓨터 성능 최적화):컴퓨터가 개발자가 쓴코드를 해석하고 실해하는 횟수를 줄이는 작업
//시간적 튜닝(알고리즘 개선(빅오표기법))
//공간적 튜닝(메모리 공간 개선(변수의 갯수를 줄이는 작업)
//사용자 관저: (일반유저)>문제 해결능력