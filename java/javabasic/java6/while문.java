package d6;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

//import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class while문 {

	public static void main(String[] args) {

		// while() :조건이 true일때까지 반복

		// boolean타입은 true나 false값만 넣을수 있음/
		// boolean타입 flag변수이름으로 메모리에 영역 선언
		// = 를 통해 true값을 flag변수에 할당(저장)
		boolean flag = true;
		// 0이라는 숫자를sum변수를 가져다가 저장
		int sum = 0;
		int i = 0;
		// while():조건이 true일 떄까지 무한반복
		while (true) {
			/// i를 2로 나누어서 나머지가 0일경우(짝수)
			// {}코드영역에 코드를 실행
			if (i % 2 == 0) {
				System.out.println(i);

			}
			// 짝수일 경우만 출력하고,
			// 1~100보다 작을 때까지 while문을 돌리시오
			// i++;후위연산자로 i값을 먼저 출력하고, i를 1증가
			i++;
			// if(i==100)i의 값을 메모리에서 가져와서
			// 100이라는 숫자와 동일하면{}코드 영역을 실행
			// {}코드 영역의 break;를 실행하여
			// 가장 가까운 for문을 종료
			if (i > 100) {
				break;
			}
		}
		// for문과while의 차이점 왠만하면 for 문을 쓰고 차이점은 while문은 조건식이 하나만 있다.

	}

	// throws Exception 코드중에 키보드 또는 마우스 입력값을 받아서 실행하는 코드일경우 JVM밖에서 일어나는 에러를 (상정)처리하기
	// 위한 선언
	public static void keyPressExample() throws Exception{
		int keycode =System.in.read();

		boolean run =true;
		int speed =0;
		int keyCode =0;
		
		while(run){
			//keycode가 13이 아니고(!=) >> true: 13이 아니면 사실이다.
			//keycode가 10이 아니면(!=) >> true: 10이 아니면 사실이다.
			//두개 다 true일 때만 {}코드 영역 실행
			if(keyCode != 13 && keyCode!=10) {
				System.out.println();
				System.out.println("1. 증속|2.감속|중지");
			}
			//System.in.read();메서드를 사용하여 사용자가 입력한 키보드 값 받기
			//단, enter키를 눌렀으므로 13 10 이라는 코드를 같이 받음
			//while문을 입력받음 값1번, 13번 1번,10번 코드 1번 총 3번의 while문을 실행한다.
			//(System.in.read();에서 전달 받은 코드가 모두 잘 전달되어 비워질떄까지!
			keycode =System.in.read();
			
			//keycode의 값이 49일 경우 {}코드 영역 실행
			if(keycode ==49) {
				speed++;
				System.out.println("현재 속도= "+ speed);
			}else if(keycode == 50 ) { //2를 읽었을 경우
				speed--;
				System.out.println("현재속도= "+ speed);
			}else if(keycode == 51) {//3을 읽었을 경우
				//메모리에 있는 run이라는 변수를 가져와서 false값을 =로 할당(저장)
				run = false;
			}
		}
			
		}
		//		while(true) {
//			//system.in.read(); 키보드의 입력값을 정수로 변환하여 전달
//			//단, enter키가 있어서 3번에 입력값을 받음 = while문 3번 실행
//			//전달된 값은 =(대입연산자를)통해 keycode변수에 할당(저장)
//			System.out.println(keycode);
//			//keycode로 입력받은 값은 0일경우
//			//정수48을 인식한다. 단 enter키를 눌렀기 때문에
//			//13하고 10도 같이 인식한다.
//			//즉, 0과 enter를 누르면 49 13 10이라는 숫자를 인식한다.
//		 if(keycode==48) {
//		System.out.println("0");
//		}else if(keycode==49) {
//		System.out.println("1");
//		}else if(keycode==50) {
//		System.out.println("2");
//		} else if(keycode==51){
//		System.out.println("3");	
//		}
//		}

}

