package d17;

import java.util.ArrayList;

public class class_studentList {
	
	//static 코드를 붙이면, 인스턴스를 여러개 만들어도
	//studentList 변수는 1개의 주소(단 한개만 존재)를 가지므로
	//어떻게 값을 변하든 공유하게 됨
	static ArrayList<class_student> studentList;
	
	//인스턴스를 만들 때 heap메모리에 값을 할당해야,
	//코드적으로 리소스를 적게 쓰기 때문
	class_studentList() {
		studentList = new ArrayList<>();
	}
	//생성자 : 인스턴스 처음에 생성할 때 실행되는 코드이므로 쓰이지 않음
	
	//메서드 : student인스턴스를 계속 저장할 때에는
	//언제, 어디서든 필요하므로 메서드를 통해서 저장하는 것이 합리적인 선택
	public void addStudent(class_student student) {
		studentList.add(student);
	}
	
	//객체를 만드는 이유 : 유지관리를 편하게 하기 위해서
	public void viewStudentList() {
		for(class_student item : studentList) {
			item.getInfo();;
		}
	}
	
	//id를 찾아서 pw바꾸는 메서드 만들기
	public void searchIdAndChangePw(String id, String pw) {
		for(class_student item : studentList) {
			//student인스턴의 id와 매개변수id가 동일하면? 조건절
			if(item.equalsId(id)) {
				item.setPw(pw);
			}
		}
	}
	
	//id확인
	public boolean searchId(String id) {
		if(studentList.size() != 0) {
			for(class_student item : studentList) {
				if(item.equalsId(id)) {
					System.out.println("동일한 id있음");
					return false;
				}
			}
			return true;
		}
		return true;
		
	}

}
