package view;

import java.util.ArrayList;

import dto.HumanDto;
import model.Model;
import util.UserInput;

public class ViewMethod {
	public static void selectMenu(Model model) {
		System.out.println("");
		System.out.println("");
		System.out.println("human관리 프로그램");
		System.out.println("1.test값 입력 2.select 3.select(height)");
		System.out.println("4.insert(dto) 5.update(name,age)");
		System.out.println("6.delete(age) 7.exit");
		int input=UserInput.inputInt("선택");
		model.setAttribute("input", input);
	}
	public static void menu1(Model model) {
		System.out.println("test값을 입력하였습니다.");
	}
	public static void menu2(Model model) {
		System.out.println("전체  데이터 출력>>");
		ArrayList<HumanDto> dtos =(ArrayList<HumanDto>) model.getAttribute("dtos");
		for(HumanDto dto:dtos) {
			System.out.println(dto);
		};
		System.out.println("select작업이 종료되었습니다.");
	}
	
	public static void menu3Input(Model model) {
		System.out.println("입력한 height값보다 큰 학생를 출력할 예정입니다.");
		model.setAttribute("height", UserInput.inputDouble("height를 입력세요"));
	}
	
	public static void menu3Output(Model model) {
		ArrayList<HumanDto> dtos=(ArrayList<HumanDto>)model.getAttribute("dtos");
		for(HumanDto dto:dtos){
			System.out.println(dto);
		};
		System.out.println("select작업이 종료되었습니다.");
	}
	public static void menu4(Model model) {
		// TODO Auto-generated method stub
		System.out.println("입력하고 자하는 Human데이터 입력");
		
		HumanDto dto=new HumanDto();
		dto.setName(UserInput.inputString("이름"));
		dto.setAge(UserInput.inputInt("나이"));
		dto.setHeight(UserInput.inputDouble("키"));
		dto.setBirthday(UserInput.inputLocalDateTime("생일"));
		
		model.setAttribute("dto", dto);
	}
	public static void menu5(Model model) {
		// TODO Auto-generated method stub
		System.out.println("특정 name으로 age변경");
		String name=UserInput.inputString("이름 :");
		int age =UserInput.inputInt("나이 :");
		
		model.setAttribute("name", name);
		model.setAttribute("age", age);		
	}
	public static void menu6(Model model) {
		System.out.println("입력한 나이보다 작은 데이터 삭제");
		int age=UserInput.inputInt("나이 :");
		model.setAttribute("age", age);
	}
	public static void menu7(Model model) {
		System.out.println("프로그램 종료");
	}

}










