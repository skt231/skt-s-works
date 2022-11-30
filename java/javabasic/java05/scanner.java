package d5;

//JVM안에 있는 Scanner라는 객체(클래스)를 가져다 쓴다.(선언)
//import 가져다 쓴다.
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// scanner :JVM밖에서 데이터를 입력받는 메서드
		//scanner() 입력받기 <-> println()출력하기
		
		//Scanner타입으로 input 변수 선언
		//new scanner(System.in);	인스턴스 Scanner실행하여 input변수에 할당(저장)
		//System.in : System객체에 입력받아서 처리하는 in객체를 담아서 인자값으로 전달
			Scanner input = new Scanner(System.in);
			//System.out(출력)<-> System.in(입력)
			//ex)
			System.out.println("당신의 이름은 무엇입니까?");
			//input.nextLine(); Scanner 선언한 input변수의
			//netLine() 메서드를 실행하면
			//사용자가 입력한 String문자를 
			//=(대입연산자) 좌측에 inputData변수에 할당(저장)
			String inputData = input.nextLine();
			String inputDataInt = input.nextLine();
			boolean inputDataBoolean = input.nextBoolean();
			System.out.println("나의 이름은 " + inputData);
			
	}

	public int nextint() {
		// TODO Auto-generated method stub
		return 0;
	}

}
