package d11;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist값_ex_1_3 {
	static ArrayList<String> studentNumArray = new ArrayList<>();
	static ArrayList<String> positionArray = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);
	
	private static int random_count0_24() {
		return(int)(Math.random()*5);
	}
	
	private static void init(int number, String string1) {
	for(int i=0;i< number;i++) {
		positionArray.add(string1);
	}
	studentNumArray.add(num01);
	studentNumArray.add(num02);
	studentNumArray.add(num03);
	studentNumArray.add(num04);
	studentNumArray.add(num05);
}
static String num01 = "심규태"; 
static String num02 = "김건희";
static String num03 = "김민기";
static String num04 = "김정환";
static String num05 = "김지희";
	public static void main(String[] args) {
		
		init(5, "-");
		System.out.println(positionArray.size());
		for (int i = 0; i < positionArray.size(); i++) {
			
			System.out.println(positionArray.get(i) + ":" + i);
		}

		String tempName = "";
		int randomNumber = 0;

		
		for (int i = 0; i < positionArray.size(); i++) {
			if (positionArray.get(i).equals("-")) {
				for (;;) {
					randomNumber = random_count0_24();
					tempName = studentNumArray.get(randomNumber);
					if (!tempName.equals("-")) {
						positionArray.set(i, tempName);
						studentNumArray.set(randomNumber, "-"); // 꼭이해
						break;
				}
			}
		}
		
		}
		
	
		view_position(positionArray);
		 int checkIndexQ1_3 = 0;
	      for (int i = 0; i < positionArray.size(); i++) {
	         if (positionArray.get(i).equals("심규태")) {
	            checkIndexQ1_3 = i;
	         }
	      }
	      System.out.println(checkIndexQ1_3);

	      // positionArray.size()-1 : 배열의 크기는 1부터 계산되어 5라는 숫자가 출력
	      // 그러므로 0부터 시작하는 배열의 위치는 -1이여야 마지막 배열 위치라고 할 수 있다
	      // 1 == 1 숫자끼리 비교해서 동일하면 true
	      if (checkIndexQ1_3 == positionArray.size() - 1) {
	         System.out.println("당신은 홀로 앉고 있습니다, 자리를 바꾸시겠습니까?");
	         System.out.println("1. 네 || 2. 아니오");
	         int check = scan.nextInt();
	         scan.nextLine();
	         if (check == 1) {
	            System.out.println("어느 위치로 자리를 바꾸시겠습니까?");
	            System.out.println("0. 좌측 앞에");
	            System.out.println("1. 우측 앞에");
	            System.out.println("2. 좌측 2번째열");
	            System.out.println("3. 우측 2번째열");
	            int checkPosition = scan.nextInt();
	            scan.nextLine();

	            switch (checkPosition) {
	            case 0:
	               positionArraySet(positionArray.size() - 1,
	                     checkPosition,
	                     "심규태"
	                     );
	               break;
	            case 1:
	               positionArraySet(positionArray.size() - 1,
	                     checkPosition,
	                     "심규태"
	                     );
	               break;
	            case 2:
	               positionArraySet(positionArray.size() - 1,
	                     checkPosition,
	                     "심규태"
	                     );
	               break;
	            case 3:
	               positionArraySet(positionArray.size() - 1,
	                     checkPosition,
	                     "심규태"
	                     );
	               break;
	            default:
	               System.out.println("번호를 잘못눌렀습니다");
	               break;
	            }
	         }
	      }
	      
	      view_position(positionArray);
	
		


	   }
	
	
	private static void positionArraySet(int beforPosition, int afterPosition, String name) {
		positionArray.set(beforPosition, positionArray.get(afterPosition));
		positionArray.set(afterPosition, name);
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
