package three;

public class 연습문제4 {
	// 메인메서드: 자바 프로그램의 시작점
	public static void main(String[] args) {

		// 자바의 시작점은 6번쨰 줄인 public static void main에서 시작
		// 순차적으로 7줄부터 8,9,10... 한줄씩 실행
		// 11번째 줄인 examEvenAndOddCustom();코드가 실행
		examEvenAndOddCustom(30);
		// =16번쨰 줄인 public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내영이 다 실행 되면 다시 12번쨰 줄부터 시작
	}
	// 짝수와 홀수
//	public static void examEvenAndOddCustom(int num) {
//	System.out.println("매개변수는 "+ num+"입니다.");

	// 1부터 매개변수 num까지 범위 내에서
	// 2의배수, 3의배수,4의 배수,5의 배수의 경우
	// 각각
	// system.out.prinln(i+"의 값은 ?배수 입니다.!")
	// 믄구를 출력하고, main메서드에서
	// examEvenAndOddCustom return값인 3의 배수, 4의 배수, 5의 배수수의
	// 개수를 double타입의 숫자로 출력하시오
//	return;
//	}
	public static double examEvenAndOddCustom(int num) {
		int i = 0;
		double count2 = 0;
		double count3 = 0;
		double count4 = 0;
		double count5 = 0;
		for (; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "의 값은 2배수 입니다.!");
				count2++;
			} else if (i % 3 == 0) {
				System.out.println(i + "의 값은 3배수 입니다.!");
				count3++;
			} else if (i % 4 == 0) {
				System.out.println(i + "의 값은 4배수 입니다.!");
				count4++;
			} else if (i % 5 == 0) {
				System.out.println(i + "의 값은 5배수 입니다.!");
				count5++;
			}
			
			// int num은 double로 자동형변환(casting)이 가능함
			// () 강제형변환 가능

			System.out.println("2의 배수의 개수는" + count2 + "입니다.");
			System.out.println("3의 배수의 개수는" + count3 + "입니다.");

			System.out.println("4의 배수의 개수는" + count4 + "입니다.");

			System.out.println("5의 배수의 개수는" + count5 + "입니다.");

		}
		return num;
	}
}
