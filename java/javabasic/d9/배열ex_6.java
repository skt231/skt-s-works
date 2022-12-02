package d10;

import java.util.ArrayList;

public class 배열ex_6 {

   // 동적타입, 정적타입(타입을 정확하게 선언함(Java..))//정적타입 알아두자(면접용)
   // static 변수가 딱 1개만 존재
   // ArrayList<> : 가변배열 타입 선언
   // ArrayList<String> : 가변배열 칸 안에는 String타입만 들어갈 수 있다
   // studentNumArray : 변수 이름 (호출할 때 이름)
   // =(대입연산자) : 우측에 있는 값을 좌측 변수에 할당(저장)
   // new ArrayList<>(); : ArrayList도구를 새로 만들어서 좌측에 저장
   // 좌측 타입과 우측 도구(타입)은 동일해야 함
   // 간략화 : String abc = "김준석";
   // 원본 : String abc = new String("김준석");
   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();

   static String num01 = "권지혜";
   static String num02 = "김건희";
   static String num03 = "김민기";
   static String num04 = "김정환";
   static String num05 = "김지희";

   // 위에까지 내용(변수들..)은 필드로써 여러가지 메서드들이 접근하여
   // 저장 혹은 수정을 할 수 있음

   private static void test() {
      System.out.println(num02);
   }

   private static void fix() {
      num02 = "박준석";
   }

   public static void main(String[] args) {
//      String num01 = "김준석";
      // num01 은 전역변수(필드), 지역변수(메서드 안에 선언된 변수)
      // 모두 같은 이름인데, 호출 할 때는 지역변수로 호출 됨

      // 호출되는 시점에서 가장 가까운 변수를 가져옴
//      System.out.println(num01);
      
      // 메서드 안에서 필드 값을 바꿀 수 있음
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
//      fix(); // fix()메서드를 가져와서 실행 (num02 전역변수 값을 박준석으로 바꿈)
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)

	   
	   //만약 positionArray 배열의 길이를 10으로 늘리고 싶다면
	   //init()메서드를 어떻게 수정 하시겠습니까?
	   //ex)인자값, 매개변수 활용해서 만들어보세요[init문제]
      init();
      String tempName = "";
      int randomNumber = 0;

      //for문:반복문: 특정조건이 성립할때까지 코드{} 반복하겠다
      //조건절: i < positionArray; 
      //i의 값이 positionArray.size()보다 작을 때까지!
      for (int i = 0; i < positionArray.size(); i++) {
    	  //if(조건식): 조건식이 true일 떄 코드 실행
    	  //positionArray 배열의 i번쨰 칸의 값이 "-"과 같으면(equals)
    	  //equals("-"): 문자열"-" 과 A의 값을 비교하겠다
    	  //positionaArray.get(i) : 베열의 i번쨰 값을 가져오겠다.(get)
    	  //equals()메서드를 쓰면 비교에 따라서 같으면 true,
    	  //다르면 false가 반돤됨(result:결과값)
         if (positionArray.get(i).equals("-")) {
            //반복문 for(;;): 조건이 없음 ->무한 반복
        	 for (;;) {
        		 //random_count0_24 메서드를 실행하여 결과값을
        		 //randomNumber 변수에 할당(저장)
               randomNumber = random_count0_24();
               tempName = studentNumArray.get(randomNumber);
               //studentNumArray 배열에 ? 번째 값을 출력
              //?= randomNumber으로 랜덤으로 값을 출력한 정수
            //tempName 변수에 학생이름 저장		   
            //tempName변수 값이 "-"이면 true
               //그 true의 값을 !(반전)을 하면 false
               //그러므로 if문 조건이 성룁되지 않는다.
               if (!tempName.equals("-")) {
            	   //위에 조건시 성립되면
            	   //tempName 변수갑은 학생이름이고
            	   //tempName을 positionArray 배열의 i번쨰 칸에 저장
            	   //A.set(i, tempName)
            	   //A배열의 i번쨰 칸에 tempName변수 값을 저장
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  break;
               }
            }
         }
      }
//      view_position(positionArray);

      // 1-1. 본인의 자리가 앞자리가 아니면 앞자리로 바꾸는 기능을 구현하시오

      // 1-2. 본인의 자리가 우측이면 좌측으로 바꾸는 기능을 구현하시오

      // 1-3. 본인의 자리가 홀로 자리이면 짝궁이 있는 자리로 바꾸는 기능을 구현하시오

      // 1-4. 본인의 자리가 첫 번째이면 마지막으로 바꿀 수 있는 기능을 구현하시오

      // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능을 구현하시오

      // 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오

      // 3-1. 자리 재배치를 했을 때 본인의 자리가 몇 번이었는지
      // 기록을 남기고 출력하시오

      // 3-2. 자기는 혼자 자리를 앉는지 확인하는 메서드를 만들고,
      // 만일 혼자 자리가 아니면, 자리를 재배치 하도록 코드를 구현하시오

   }
//private: 접근제한자로써 in()메서드는 같은 class내에서만 쓸수 있음
   //예) 여기 클래스에서 여러 메서드들이 있는데, 클래스 내부에서만 쓸수 있고,
   //외부클래스(다른자바파일 등등..)에서는 init()메서드를 호출하여 쓸수 없음
   //<> public
   //static: 한개만 있음!<> 인스턴스
   //void:메서드를 실행하면 return값이 없음
   //예) String abc = init();(x) init()메서드는 void이므로
   //abc변수에 무언가의 값을 저장할수 업슴
   private static void init() {
	   //초기식 : int i=0;
	   //조건식 : i <5; (for문 돌때마다 i의 값을 확인하는데
	   //5보다 작을 떄까지 for은 계속 된다.)
	   //증감식 : i++: for문 한번 돌떄마다 i의 값을 1씩 증가
      for (int i = 0; i < 5; i++) {
    	  //positionArray 배열에 순서대로
    	  //0번쨰 배열칸에 "-"추가(add)
    	  //1번쨰 배열칸에 "-"추가(add)
    	  //2번쨰 배열칸에 "-"추가(add)...
         positionArray.add("-");
      }
      //전역변수 studentNumArray 배열에 순서대로
      //전역변수 num01의 값을 추가(add)
      //추가:배열의 끝에 추가적으로 저장
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);
   }

   private static int random_count0_24() {
	   //Math.random() : 0.00~0.99 사이 수를 랜덤으로 출력
	   //0.00..*25 ==0;
	   //0.99..*25=24.99..; 1*25=25 .> 1보다 작은 수를 곱하므로
	   //결론적으로 24.99..같이 출력됨
//	   (int) 형변환 하므로 소수점 삭제
	   //0~24 숫자(정수) 중에 한개 출력
      return (int) (Math.random() * 5);
   }

   private static void view_position(ArrayList<String> positionArray) {
      System.out.println("[문]--------------------------");
      for (int i = 1; i <= positionArray.size(); i++) {
         if (i % 2 == 0) {
            System.out.printf(positionArray.get(i - 1) + "/ ");
            System.out.println();
         } else {
            System.out.printf(positionArray.get(i - 1) + "/ ");
         }
      }
      System.out.println();
   }

}