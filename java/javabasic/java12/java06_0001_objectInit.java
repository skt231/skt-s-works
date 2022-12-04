package d15;

import java.util.ArrayList;

import com.human.code20221005.Student;

public class java06_0001_objectInit {

	public static void main(String[] args) {
		
		// 20221004 history
		// 1. 클래스와 인스턴스
		// 2. 필드와 생성자와 메서드
		// 3. private / public
		
		//자동차 인스턴스
		//car001 변수에 Car타입으로 저장가능 (선언)
		//Car라는 인스턴스(객체)를 만들어서
		//car001에 할당(저장)
		//인스턴스 : class(설계도) 토대로 새로 만드는 객체
		//(heap 메모리에 저장(참조타입))
		Car car001 = new Car();
		Car car002 = new Car();
		car002.color = "빨강";
		
		System.out.println(car001.model);
		System.out.println(car001.color);
		System.out.println("--------------");
		System.out.println(car002.model);
		System.out.println(car002.color);
		
		System.out.println("--------------");
		
		
		//객체 생성
		Car myCar = new Car();
		String stringcheckImpl = "test";
		String stringCheck = new String("test");
		
		//필드값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		//필드값 변경
		myCar.speed= 60;
		System.out.println("수정된 속도: "+myCar.speed);
		
		//example001. Car라는 클래스에 name이라는 변수를 넣고
		//인스턴스를 만들 때마다 이름을 부여하고
		//sysout으로 출력하시오
		Car carName001 = new Car();
		carName001.name = "김준석의 캐스퍼";
		
		System.out.println(carName001.name);
		System.out.println(carName001.model);
		
		ArrayList<Car> myCarList = new ArrayList<>();
		
		myCarList.add(carName001);
		myCarList.add(myCar);
		myCarList.add(car001);
		myCarList.add(car002);
		
		System.out.println(carName001.info());
		
		System.out.println("-----------");
		for(int i = 0; i<myCarList.size(); i++) {
			System.out.println(myCarList.get(i).info());
		}
		System.out.println("-----------");
		
		
		
		java06_0100_object_group test = 
				new java06_0100_object_group();
		
		System.out.println(test.getGroupName());
		
		//#인스턴스 이해하기
		//1-1. 여러 그룹을 만드는 class를 작성하시고,
		//그룹 별 조원 중에 랜덤으로 뽑는 인스턴스를 만드시오
		//(요구사항 파악, 필요한 필드 선정 능력, 인스턴스 이해)

		//1-2. 학생 정보를 담는 student 인스턴스를 배열에 담아
		//출력하는 메서드를 만드시오
		//(정보 체계화, 참조 객체 인스턴스 관리)
		
		//1-3. oneDay toDoList를 자유롭게 class를 만드시오
		//예)날짜, startTime, endTime, 할일
		//(정보 체계화, 참조객체 자유구사, 인스턴스 관리)
		
		//#오버로딩 이해하기
		//2-1. 필수사항(id, pw) 외 선택사항(email, tel, address)를
		//저장하는 인스턴스를 만드시오
		//(인스턴스 다양화, 데이터 저장과 수정)
		
		//#회원가입 시스템 만들기
		//3. 학생 정보를 입력받는 시스템
		//pw를 바꾸는 시스템
		//랜덤으로 출력하는 시스템
		//(종합)
	}

}
