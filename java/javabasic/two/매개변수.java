package two;

public class 매개변수 {

	public static void main(String[] args) {
		//매개변수와 인자
		String name = "김준석";
		
		String abcdSave = methodTest(name);
		System.out.println("main method에서 실행!! "+abcdSave);
		//methodTest(name)는 name이라는 인자값(전달값)을 넣고 실행
				//String abcdSave : abcdSave 변수에는 String 문자열만 저장 가능 선언!
				//= methodTest() : methodTest()에서 나오는 문자열을 대입연산자 좌측에 할당
				//= "abcd"; >> methodTest() 호출(불러오면)하면 "abcd"문자열을 받음	
	}
	
	//public 접근제한자
	//static 유일한 메서드
	//void 리턴 값이 없음
	public static String methodTest(String inputName) {
		System.out.println("정상적 출력! "+inputName);
		return inputName;
	}

}
//20220914 history
//1. type은 선언부로써 변수에 들어갈 수 있는 타입을 선언하는 부분이며, 
//=(대입연산자) 우측 부분의 값이 좌측 변수에 할당되는 개념
//2. for문(2중for문)의 초기식, 조건식, 증감식이 있고 {}코드가 조건식을 만족할 때까지 실행
//3. if문의 조건식은 성립(true)될 경우 if문 안에 {}코드가 실행
//4. 매개변수는 다른 메서드에 특정 값을 전달하여 받는 매개체를 일컫음
