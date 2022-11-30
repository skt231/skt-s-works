package d6;

public class while문_ex {

	public static void main(String[] args) throws Exception {
		// 에어컨 리모콘 만들기
		// 현재 온도는 30도이다.
		// 냉방모드에서 1번을 누르면 온도 1감소
		// 2번을 누르면 온도 1증가를 메뉴가 있다
		// 리모콘 메뉴를 만드시오
		// 더불어, 3을 누르면 터보 모드로 최저온도 18도로 세팅된다.
		int keycode = System.in.read();

		boolean run = true;
		int temperature = 30;
		int keyCode = 0;
//		for (int i = 0; i < 50; i++) {
			if (keycode == 48) {
				run = true;
				System.out.println("전원on");
				
					if (keyCode != 13 && keyCode != 10) {
						System.out.println("----------------------");
						System.out.println("0.on|1. ▼|2.▲|3.터보모드|4.off");
						System.out.println("----------------------");
					}
					while (run) {
					keycode = System.in.read();

					if (keycode == 49) {
						temperature--;
						if (temperature <= 18) {
							System.out.println("온도를 더이상 내릴수 없습니다.");
							temperature = 18;
						}
						System.out.println("현재온도 = " + temperature);

					} else if (keycode == 50) {
						temperature++;
						if (temperature >= 50) {
							System.out.println("온도를 더이상 올릴수 없습니다.");
							temperature = 50;
						}
						System.out.println("현재온도 = " + temperature);
					} else if (keycode == 51) {
						System.out.println("현재온도 = " + 18);
					} else if (keycode == 52) {
						run = false;
						System.out.println("전원 off");
										
					}
					
					}
			}
		}
//	}

	// 디버깅 모드: 코드를 한줄 인식하여 알고리즘 어떻게 흘러가는지 보는 모드
	// 장점1. 변수 모두다 확인가능(현재 코드 줄수에서 변수 데이터 확인)
	// 장점2. 코드 한 줄 씩 보기때문에 사람이 식별할 수 있는 속도
	public static void main1(String[] args) throws Exception {
		boolean run = true;
		int temperature = 30;
		int keyCode = 0;

	}
}
