package d6;

import java.util.Scanner;

import code20220919.scanner;

public class randomAndEquals {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      String inputData = "";
	      for(;;) {
	         System.out.println("값을 입력하시오!");
	         inputData = scan.nextLine();

			//A.equals("b")
			//equals()메서드를 사용하여 A변수의 데이터(문자열)와
			//"B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
			//유사) == : 숫자비교
			if(inputData.equals("김준석")) {
				System.out.println("휴면교육센터 선생");
			 }else if(inputData.equals("박준석")) {
		            System.out.println("잘 모르겠음");
		         }else if(inputData.equals("이준석")) {
		            System.out.println("국민의 당 당대표");
		         }else {
		            System.out.println("다시 입력하세요!");
		         }
		}
	}
}


