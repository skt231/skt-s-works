package d5;

import java.security.PublicKey;
import java.util.Scanner;

public class scanner_ex2 {

	public static void menuchoice(int Menuchoice, int MenuCourt) {
		// 당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
		// 다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
		// 1. 안심 돈까스 : 9000원
		// 2. 등심 돈까스 : 8000원
		// (단, 고객을 확보하기 위해
		// 만원이상이면, 10%할인, 2만원 이상이면 20%할인을 하는
		// 만원 단위별로 10%씩 증가하는
		// 최대 50%할인 대박세일을 진행하려 합니다.)
		
		System.out.println("안녕하세요 돈까스입니다.");
		System.out.println("주문하실라면 아무 숫자나 입력해주세요");
		Scanner scanhome = new Scanner(System.in);
		int homechoice = scanhome.nextInt();

		int price = 0;
		if (Menuchoice == 1) {
			price = 9000;
		} else if (Menuchoice == 2) {
			price = 8000;
		}
		scanner scanMenu = new scanner(System.in);
		int MenuChoice =scanMenu.nextint();
		System.out.println("개수를 입력하세요");
		
		 int tableNum = 0;
	      for(int i = 0; i<1; i++) {
	         System.out.println("서빙 받을 테이블 숫자를 입력하세요");
	         tableNum = scanMenu.nextInt();
	   
	         if(tableNum <=4 && tableNum > 0) {
	            System.out.println(tableNum +"테이블 입니다");
	         }else {
	            i--;
	            System.out.println("다시 입력 해 주세요");
		
	            String menuString = "";
	            int price = 0;
	            if(MenuChoice == 1) {
	               menuString = "안심 돈까스";
	               price = 2000;
	            }else if(MenuChoice == 2) {
	               menuString = "등심 돈까스";
	               price = 4000;
	            }
	            System.out.println("주방장님 메뉴 들어왔습니다!");
	            System.out.println(tableNum+"테이블의 ");
	            System.out.println("선택한 메뉴는 "+menuString+" 이고, ");
	            System.out.println("메뉴의 개수는 "+MenuCourt+" 입니다 ");
	            
	            System.out.println("결제 금액은 다음과 같습니다");
	            System.out.println(tableNum+"테이블의 ");
	            System.out.println("총 정산 금액은 "+ price*MenuCourt);
	            
		double total = 0;
		if (total >= 50000) {
			total = total - (total * 0.5);
		} else if (total >= 40000) {
			total = total - (total * 0.4);
		} else if (total >= 30000) {
			total = total - (total * 0.3);
		} else if (total >= 20000) {
			total = total - (total * 0.2);
		} else if (total >= 10000) {
			total = total - (total * 0.1);
		}

//		//Scanner타입으로 scan변수이름 선언
//		//new Scanner Scanner객체를 "새로 생성하여" scan 변수에 할당(저장)
//		//단, 인자값 System.in을 넣어서 키보드와 연동되도록 지정
//		Scanner scaanS =new Scanner(System.in);
//		System.out.prinln("결제 금액은?");
//		//scan변수에 있는 scanner를 가져다가 nextInt()메서드를 실행하여
//		//사용자가 입력한 키보드 값을 price변수에 할당(저장)
//		int price=scan.nextInt();
//		price = (int)(price* 0.6);
//		//(price *0.6)소수점 연산이므로 int타입이 아님
//		//int타입은 소수점 연산보다 범위가 작으므로
//		//(int)타입으로 강제 형변환 하여 price 타입 int와 동일하게 맞춰서 할당(저장)
//		price = (int)(price *0.6);
//		System.out.println("할인 된 금액 = "+price);
//		//(price>5000)? price는 5000원보다 큰가? true/ false확인
//		//A결과:B결과 // true이면 A결과, false이면 B결과 출력
//		System.out.println((price>5000)?);
//		System.out.println("할인된 금액 = ");
	}
	      }
	}
}


