package d9;

import java.util.Arrays;
//숫자 1부터 45까지 숫자를 랜덤으로 뽑아서
//저장하는 고정배열을 만드시오
import java.util.Scanner;

public class 배열_ex_1 {

	public static void main(String[] args) {

		int[] lottoNumList = new int[6];
		for (int i = 0; i < lottoNumList.length; i++) {
			lottoNumList[i] = (int) (Math.random() * 45) + 1;
			// 1) 예시로 랜덤으로 5숫자가 나오면
			// lottoNumList배열을 for문으로 돌려서 같은 값이 있는지 확인하기
			// 2) 같은 값이 있으면 다시 랜덤으로 뽑기
			// (continue로 처음으로 돌아가거나, 무한for문과 break사용하기 등등)
	//		for (int k = 0; k < i; k++) {
	//			if (lottoNumList[i] == lottoNumList[k]) {
	//				System.out.println("같은 숫자를 뽑았습니다");
	//				i--;
					// 낭비 방지
					// 예를 들어 i의 값이 5이고
					// k의 값이 2이다
					// k[2]에서 같은 숫자가 나오면
					// 3,4,5배열 방에 있는 값을 구지 찾을 필요가 없이
					// 중복값을 찾았으므로
					// for문 종료
	//				break;
	//			}
	//		}
		}
	//	for (int i = 0; i < lottoNumList.length; i++) {
			System.out.println(Arrays.toString(lottoNumList));
		}
	}
