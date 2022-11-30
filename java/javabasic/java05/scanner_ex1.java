package d5;

//JVM안에 있는 Scanner라는 객체(클래스)를 가져다 쓴다! (선언)
//import 가져다 쓴다!
import java.util.Scanner;

public class scanner_ex1 {
   
   public static int menuChoice(int MenuChoice, int MenuCount) {
      int price = 0;
      if(MenuChoice == 1) {
         price = 2000;
      }else if(MenuChoice == 2) {
         price = 4000;
      }else if(MenuChoice == 3) {
         price = 4500;
      }
      return price*MenuCount;
   }
   
   
   public static void questionStep1() {
      System.out.println("|---------------------------|");
      System.out.println("|----안녕하세요  떡볶이 집입니다---|");
      System.out.println("|--------메뉴를선택하세요. ------|");
      System.out.println("|1. 매운 떡볶이 : 가격 개당 2000원|");
      System.out.println("|2. 마늘 떡볶이 : 가격 개당 4000원|");
      System.out.println("|3. 엽기 떡볶이 : 가격 개당 4500원|");
      
   
      
      //Scanner타입으로 scanMenu변수이름 선언
      //new 객체생성(도구생성)
      //Scanner라는 도구를 새로 생성한다 (인자는 System.in을 쓰겠다)
      //System.in 컴퓨터 키보드와 같은 입력을 받을 수 있는 도구를 사용하는 객체
      //생성된 도구(객체)는 scanMenu메모리 영역에 저장
      Scanner scanMenu = new Scanner(System.in);
      //int타입으로 MenuChoice변수이름 선언!
      //=(대입연산자) 우측에 scanMenu변수에 있는 Scanner도구를 메모리에서
      //가져와서 nextInt()메서드를 실행!
      //실행하면 키보드의 입력값(int타입으로)을 받아서
      //menuChoice 변수에 할당(저장)
      int MenuChoice = scanMenu.nextInt();
      //개수 입력
      System.out.println("개수를 입력하세요");
      int MenuCount = scanMenu.nextInt();
      //결과 출력
      
      //table의 개수는 4개, 1~4까지 있음
      //tableNum 사용자가 입력하는 테이블의 숫자를 저장하는 변수 선언
      int tableNum = 0;
      //고객이 앉는 테이블 번호 입력 받음
      //int i의 초기값은 0으로 1번만 돌면 종료되는 조건 i<0을 갖고 실행
      for(int i = 0; i<1; i++) {
         System.out.println("서빙 받을 테이블 숫자를 입력하세요");
         //이미 만들어진 tableNum변수를 가져다 씀
         //scanMenu.nextInt(); 사용자가 입력한 정수를 tableNum에 할당(저장)
         tableNum = scanMenu.nextInt();
         //tableNum <=4 조건이 성립하면 true
         //tableNum > 0 조건 성립하면 true
         //&& 두 조건이 모두 성립하면 true
         if(tableNum <=4 && tableNum > 0) {
            System.out.println(tableNum +"테이블 입니다");
         }else {
            //조건이 성립되지 않으면 i는 1감소
            i--;
            System.out.println("다시 입력 해 주세요");
         }
         //조건이 성립되지 않으면 이 줄에서는 i가 -1
      }
      
      
      
      String menuString = "";
      int price = 0;
      if(MenuChoice == 1) {
         menuString = "매운 떡볶이";
         price = 2000;
      }else if(MenuChoice == 2) {
         menuString = "마늘 떡볶이";
         price = 4000;
      }else if(MenuChoice == 3) {
         menuString = "엽기 떡볶이";
         price = 4500;
      }
      System.out.println("주방장님 메뉴 들어왔습니다!");
      System.out.println(tableNum+"테이블의 ");
      System.out.println("선택한 메뉴는 "+menuString+" 이고, ");
      System.out.println("메뉴의 개수는 "+MenuCount+" 입니다 ");
      
      System.out.println("결제 금액은 다음과 같습니다");
      System.out.println(tableNum+"테이블의 ");
      System.out.println("총 정산 금액은 "+ price*MenuCount);
      
      //if, for, else, Scanner, println
      //당신은 떡볶이 집 운영자 입니다.
      //오더를 자동화 하기 위해 키오스크 시스템을 만들려고 합니다.
      //다음과 같은 떡볶이 메뉴를 출력하고, 
      //고객명과 입력받은 떡볶이를 주방장과 결제시스템에게 
      //데이터를 전달하는 시스템을 구축하시오.
      //메뉴)
      //1. 매운 떡볶이 : 2000원
      //2. 마늘 떡볶이 : 4000원
      //3. 엽기 떡볶이 : 4500원
   }
   
   public static void questionStep1_1() {
      //당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
      //다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
      //1. 안심 돈가스 : 9000원
      //2. 등심 돈가스 : 8000원
      //(단, 고객을 확하기하기 위해 
      //만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
      //만원 단위별로 10%씩 증가하는 
      //최대 50%할인 대박세일을 진행하려 합니다)
      
      //Scanner 타입으로 scan변수이름 선언
      //new Scanner Scanner객체를 "새로 생성하여" scan 변수에 할당(저장)
      //단, 인자값 System.in을 을 넣어서 키보드와 연동되도록 지정
      Scanner scan = new Scanner(System.in);
      System.out.println("결제 금액은?");
      //scan변수에 있는 Scanner를 가져다가 nextInt()메서드를 실행하여
      //사용자가 입력한 키보드 값을 price변수에 할당(저장)
      int price = scan.nextInt();
      //(price * 0.6) 소수점 연산이므로 int타입이 아님!
      //int타입은 소수점 연산보다 범위가 작으므로
      //(int)타입으로 강제 형변환하여 price 타입 int와 동일하게 맞춰서 할당(저장)
      price = (int)(price * 0.6);
      System.out.println("할인 된 금액 = "+price);
      //(price>5000)? price는 5000보다 큰가? true / false 확인
      // A결과 : B결과 // true이면 A결과, false이면 B결과 출력
      System.out.println((price>5000)? "5000원보다 비쌉니다":"5000원보다 쌉니다");
   }
   
  
      
      Scanner scan = new Scanner(System.in);
      
   

   public static void exam() {
      Scanner scanMenu = new Scanner(System.in);
      int MenuChoice = 0; 
      int addCount = 0;
      for(int i =0; i<1; i++) {
         System.out.println("|---------------------------|");
         System.out.println("|----안녕하세요  떡볶이 집입니다---|");
         System.out.println("|--------메뉴를선택하세요. ------|");
         System.out.println("|1. 매운 떡볶이 : 가격 개당 2000원|");
         System.out.println("|2. 마늘 떡볶이 : 가격 개당 4000원|");
         System.out.println("|3. 엽기 떡볶이 : 가격 개당 4500원|");
         
         MenuChoice = scanMenu.nextInt();
         
         System.out.println("메뉴를 추가하겠습니까?");
         int addMenu = scanMenu.nextInt();
         if(addMenu == 1) {
            addCount++;
            i--;
         }
      }
   }
}