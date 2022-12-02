package d11;

import java.util.ArrayList;

public class Arrlist값_ex_1_4 {
	static ArrayList<String> studentNumArray = new ArrayList<>();
	static ArrayList<String> positionArray = new ArrayList<>();

	private static void switchArray(int i, String string) {
	      //i : 마지막 배열에 위치
	      //string : 본인이름
	      positionArray.set(0, positionArray.get(i));
	      positionArray.set(i, string);
	}
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
	System.out.println("----------1-4------------");
	
	switchArray(positionArray.size() - 1, "심규태");


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
