package d21;

public class Quiz생성자호출_순서 {

	public static void main(String[] args) {
		F f = new F(); // B생성자 호출<----0 번

	}// <-----12번 끝

}

class D {
	// int a;
	D() { // <---3번
		this(30); // 생성자 호출 4번//A라는 클래스에 있는 생성자중에 A(숫자형); this
		System.out.println("D()"); // <---7번
	}

	D(int a) { // <---5번
		System.out.println("D(int d)"); // <--6번
	}
}

class F extends D {
	F() { // <--------1번
		// super(); 이 숨어있음 //부모 생성자 호출 2번
		this(10); // <---8번//B라는 클래스에 있는 생성자중에 B(숫자형); this
		System.out.println("F()"); // <--11번
	}

	F(int f) { // <----9번
		System.out.println("F(int f)"); // <----10번
	}

}
