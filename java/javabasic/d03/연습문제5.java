package three;

public class 연습문제5 {

	// 메인메서드: 자바 프로그램의 시작점
	public static void main(String[] args) {

		// 자바의 시작점은 6번쨰 줄인 public static void main에서 시작
		// 순차적으로 7줄부터 8,9,20... 한줄씩 실행
		// 11번째 줄인 examEvenAndOddCustom();코드가 실행
		examEvenAndOddCustom(30);
		// =16번쨰 줄인 public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내영이 다 실행 되면 다시 12번쨰 줄부터 시작
	}

	private static void examEvenAndOddCustom(int i) {
		// TODO Auto-generated method stub
		
	}

	// 프로그래머스 짝수와 홀수 문제
	public String solution(int num) {
		String answer = "";
		// 짝수 홀수를 찾는 if문 만들기
		// 짝수란 2로 나누어서 0으로 떨어지는 수 (나머지 0 = (num%2==0)
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}

		return answer;
	}

}