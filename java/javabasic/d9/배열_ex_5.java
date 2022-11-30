package d9;

public class 배열_ex_5 {

	public static void main(String[] args) {
		// 3. 랜덤으로 자리를 0~24개를 배치한 학생 이름을 출력하시오
		// 1)0~24까지 숫자를 랜덤으로(중복없이) 배열에 저장하기
		int[] saveNumList = new int[25];
		for (int i = 0; i < saveNumList.length; i++) {
			saveNumList[i] = random_count0_24();
			for (int k = 0; k < i; k++) {
				if (saveNumList[i] == saveNumList[k]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < saveNumList.length; i++) {
			System.out.println(saveNumList[i]);
		}

		System.out.println("-------------");
		// 2) 교실 자리 배치를 console창에 출력하시오
		// 1/ 2/ 3/ 4/ 5
		// 6/ 7/ 8/ 9/ 10
		// 11/ 12 /13 /14 /15
		// 16/ 17/ 18/ 19
		// 20/ 21/ 22/ 23
		// 24/ 25
		for (int i = 0; i < 25; i++) {
			// 활용 개념 : %(나머지), for, if
			// 기타 : break 등등
			for (int k = 0; k < 5; k++) {
				System.out.print(k + 1);
			}
			System.out.println();
		}

	}

	private static int random_count0_24() {
		return (int) (Math.random() * 25);
	}

}
