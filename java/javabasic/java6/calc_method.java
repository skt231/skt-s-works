package d8;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class calc_method {

	// main(); 자바 프로그램의 가장 처음 시작되는 메서드 (시작점이자 끝)
	public static void main(String[] args) {
		// 사칙연산 계산기 method ver
		// +,-,*,/ 연산의 메서드를 만드시오
		// 단, 하나의 기능하는 메서드를 다수 만들어서 복합적으로 구성하시오

		// Scammer 타입으로 scan변수 이름 을 선언
		// =(대입연산자) Scanner 도구를 만들어서(new)
		// 좌측 항 scan변수에 저장(할당)
		view_welcome();
		// int타입으로 temp_num변수이름 선언
		// =(대입연산자) 우측 항 실행
		// scan 변수를 호출하여(메모리에 있는 scan변수를 호출)
		// nextInc()메머드를 실행 >> 키보드에서 입력받은 숫자를 가져옴
		// 대입연산자 좌측항에 들어 있는 temp_num 변수에 저장
//		int temp_num= scanner.nextInt();
		// 버퍼에 남아있느는 개행 문자들 꺠끗히 청소하기 위한 nextLine() 메서드 실행
		// nextLine()메머드를 실행하면 버퍼에 문자열로 취급하여 가져감
		for (;;) {
			Scanner scan = new Scanner(System.in);

			view_numberPlz();
			double temp_num = scan.nextInt();
			scan.nextLine();

			view_stringPlz();
			String temp_oper = scan.nextLine();

			view_numberPlz();
			int temp_num_second = scan.nextInt();
			scan.nextLine();

			temp_num = calc_Start(temp_num, temp_oper, temp_num_second);

//      System.out.println(temp_num);

		}
	}

	private static void view_welcome() {
		System.out.println("                         ");
		System.out.println("--------안녕하세요---------");
		System.out.println("-------계산기입니다---------");
		System.out.println("-------------------------");
		System.out.println("--먼저 첫번쨰 숫자를 입력하시고--");
		System.out.println("-----연산자를 입력하시고------");
		System.out.println("----두 번쨰 숫자를 입력하시면--");
		System.out.println("-----결과가 출력됩니다.-------");
		System.out.println("-------------------------");
		System.out.println("                         ");
		System.out.println("                         ");
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("   +  ------ 7   8   9 --");
		System.out.println("   -  ------           --");
		System.out.println("   *  ------ 4   5   6 --");
		System.out.println(" (나누기)/----           --");
		System.out.println(" (제곱)^  --- 1   2   3 --");
		System.out.println(" (log)L ---           ---");
		System.out.println(" (v-)v ------   0 -------");
		System.out.println("-------------------------");
	}

	private static void view_numberPlz() {
		System.out.println("숫자를 입력하시오");
	}

	private static void view_stringPlz() {
		System.out.println("문자를 입력하시오");
	}

	private static double calc_plus(double temp_num, String B, int C) {
		double result = 0;

		if (B.equals("+")) {
			result = temp_num + C;
			System.out.println("-----------------------");
			System.out.println("답은 " + result + "입니다.");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
		}
		return result;
	}

	private static double calc_minus(double temp_num, String B, int C) {
		double result = 0;

		if (B.equals("-")) {
			result = temp_num - C;
			System.out.println("-----------------------");
			System.out.println("답은 " + result + "입니다.");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
		}
		return result;
	}

	private static double calc_multiplication(double temp_num, String B, int C) {
		double result = 0;

		if (B.equals("*")) {
			result = temp_num * C;
			System.out.println("-----------------------");
			System.out.println("답은 " + result + "입니다.");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
		}
		return result;
	}

	private static double calc_division(double temp_num, String B, int C) {
		double result = 0;

		if (B.equals("/")) {
			result = temp_num / C;
			System.out.println("-----------------------");
			System.out.println("답은 " + result + "입니다.");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
		}
		return result;
	}

	private static double calc_squared(double temp_num, String B, int C) {
		double result = 0;

		if (B.equals("^")) {
			result = Math.pow(temp_num, C);
			System.out.println("-----------------------");
			System.out.println("답은 " + result + "입니다.");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");
			System.out.println("                       ");

		}
		return result;
	}

	private static double calc_sqrt(double temp_num, String B) {
		double result = Math.sqrt(temp_num);

		if (B.equals("v")) {
			result = Math.sqrt(temp_num);
			System.out.println("-----------------------");
			System.out.println("값은 " + result + "입니다.\n");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("------------------------");
		}
		return result;
	}

	private static double calc_log(double temp_num, String B) {
		double result = Math.sqrt(temp_num);

		if (B.equals("L")) {
			result = Math.log(temp_num);
			System.out.println("-----------------------");
			System.out.println("값은 " + result + "입니다.\n");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("------------------------");
		}
		return result;
	}

	private static double calc_Start(double temp_num, String B, int C) {
		double result = 0;
		if (B.equals("+") || B.equals("-") || B.equals("*") || B.equals("/") || B.equals("^") || B.equals("")

		) {
			if (B.equals("+")) {
				result = calc_plus(temp_num, B, C);
			} else if (B.equals("-")) {
				result = calc_minus(temp_num, B, C);
			} else if (B.equals("*")) {
				result = calc_multiplication(temp_num, B, C);
			} else if (B.equals("/")) {
				result = calc_division(temp_num, B, C);
			} else if (B.equals("^")) {
				result = calc_squared(temp_num, B, C);
			} else if (B.equals("v")) {
				result = calc_sqrt(temp_num, B);
			} else if (B.equals("L")) {
				result = calc_log(temp_num, B);
			} else {
				System.out.println("연산자가 아닙니다!\n 다시 계산하세요!");
				System.out.println("-------------");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("             ");
				System.out.println("-------------");

			}
			return result;
		}
		return result;
	}
}
