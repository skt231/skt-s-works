package basic01;
//드모르간의 법칙:각 조건을 부정하고 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다.
//1.x&& y와 !(x||y)는 같다.
//2. x||y 와 !(!x && !y)는 같다.
import java.util.Scanner;

//2자리의 양수(10~99)를 입력하세요
public class Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요");
		
		do {
			System.out.println("입력 : ");
			no = scan.nextInt();
		} while(no<10 || no>99);
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");

	}

}