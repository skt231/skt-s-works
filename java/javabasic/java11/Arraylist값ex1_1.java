package d11;

import java.util.ArrayList;

public class Arraylist값__ex_1_1 {
	static ArrayList<String> studentNumArray = new ArrayList<>();
	static ArrayList<String> positionArray = new ArrayList<>();

	static String num01 = "심규태";
	static String num02 = "김건희";
	static String num03 = "김민기";
	static String num04 = "김정환";
	static String num05 = "김지희";
	
	private static int random_count0_24() {
		return (int) (Math.random() * 5);
	}

	private static void init(int number, String string1) {
		for (int i = 0; i < number; i++) {
			positionArray.add(string1);
		}
		studentNumArray.add(num01);
		studentNumArray.add(num02);
		studentNumArray.add(num03);
		studentNumArray.add(num04);
		studentNumArray.add(num05);
	}

	

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

		System.out.println("----------1-1------------");
		if (positionArray.get(0).equals("심규태")) {
			System.out.println("심규태씨는 0번째 위치 입니다");
		} else {
			System.out.println("심규태씨는 0번째 위치 아닙니다");
		int checkPosition = 0;
		for (int i = 0; i < positionArray.size(); i++) {
			if (positionArray.get(i).equals("심규태")) {
				checkPosition = i;
			}
		}
		positionArray.set(checkPosition, positionArray.get(0));
		positionArray.set(0, "심규태");
		
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
