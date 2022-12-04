package d15;

import java.util.ArrayList;

public class java06_0003_studentListObject {

	public static void main(String[] args) {
		//1-2. 학생 정보를 담는 student 인스턴스를 배열에 담아
		//출력하는 메서드를 만드시오
		//(정보 체계화, 참조 객체 인스턴스 관리, public/private)
		//1) 학생 정보를 담는? = 데이터를 넣는다 (담을 수 있는 필드필요)
		//2) 인스턴스에 할당된 필드 값을 출력하는 메서드를 만들고, 실행
		//3) private / public 예제

		ArrayList<String> inputData = new ArrayList<>();
		inputData.add("이준배");
		inputData.add("박송헌");
		inputData.add("박유진");
		
		//StudentList 타입으로 list변수명을 선언
		//=(대입연산자) 우측에 있는 StudentList로 인스턴스를 만들어서
		//좌측 list변수에 할당
		//(inputData) 인자값 inputdata를 전달 (생성자, 매개변수로 사용)
		StudentList list = new StudentList(inputData, "김준석");
		
		//객체를 사용하는 모든 수단은 객체지향프로그래밍에서는 인스턴스화 하여 사용
		String abc = "김준석";
		//String 클래스(설계도)를 인스턴스를 만들어서
		//문자열("김준석")을 abcd변수에 할당(저장)
		String abcd = new String("김준석");
		
		//list 인스턴스에 있는 addStudent메서드 실행
		//(addStudent메서드는 StudentList 클래스 내부에 선언한 메서드)
		//*클래스를 토대로 새로 생성한 인스턴스
		list.addStudent("김현중");
		list.addStudent("권지혜");
		list.addStudent("김민기");
		
		//생성자로 데이터를 필드에 넣을 경우 : 인스턴스를 생성할 때 1회의 작업으로
		//데이터 저장 (컴퓨터 연산 최소화)
		//메서드로 데이터를 필드에 넣을 경우 : 여러번의 실행 코드를 이행하여
		//데이터 저장 (컴퓨터 연산 계속 증가) 단, 언제 어디서든 데이터 입력 가능
		
		//캡슐화 : 인스턴스(클래스) 내부 필드값을 안전하게 보호
		//ex) 필드값 바로 조회x = 메서드를 통해서 데이터 접근하기
		//private로 선언된 데이터는 class 외부에서 조회 불가능하게 하여
		//한정된 통로로만 class 내부 데이터 조회 가능
//		list.getStudentList();
		
		//list라는 인스턴스 안에 studentList필드값 배열의 0번째 값을 출력
		list.getTest();
		
	}

}
