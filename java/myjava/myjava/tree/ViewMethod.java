package myjava.tree;

import java.util.ArrayList;

public class ViewMethod {
	public static void selectMenu(Model model) {
		System.out.println("-------------------------------");
		System.out.println("--  나무 관리 시스템	 --");
		System.out.println("----------1.시작 ---------------");
		System.out.println("---2.select 3.select------------");
		System.out.println("------4.insert 5.update---------");
		System.out.println("----6.delete  7.exit------------");
		System.out.println("--------------------------------");
		int input = UserInput.inputInt("선택");
		model.setAttribute("input", input);

	}

	public static void menu1(Model model) {
		System.out.println("시작합니다.");
	}

	public static void menu2(Model model) {
		System.out.println("전체 데이터를 출력합니다.");
		@SuppressWarnings("unchecked")
		ArrayList<Treedto> dtos = (ArrayList<Treedto>) model.getAttribute("dtos");
		for (Treedto dto : dtos) {
			System.out.println(dto);
		}
		System.out.println("select작업을 종료합니다.");
	}

	public static void menu3Input(Model model) {
		System.out.println("입력한 nowplant값보다 현재 심은 나무개수가 작은 나무를 출력합니다.");
		model.setAttribute("nowplant", UserInput.inputInt("나무개수를 입력하세요"));
	}

	public static void menu3OutPut(Model model) {
		ArrayList<Treedto> dtos = (ArrayList<Treedto>) model.getAttribute("dtos");
		for (Treedto dto : dtos) {
			System.out.println(dto);
		}
		System.out.println("작업이 종료되었습니다.");
	}

	public static void menu4(Model model) {
		System.out.println("나무정보를 입력하세요");

		Treedto dto = new Treedto();
		String name = UserInput.inputString("이름");
		dto.setName(name);
		dto.setPrice(UserInput.inputInt("가격"));
		dto.setGrowtime(UserInput.inputLocalDateTime("자라는시간"));
		dto.setExp(UserInput.inputInt("경험치 량"));
		dto.setNowplant(UserInput.inputInt("현재 심어진 나무 갯수"));
		dto.setMaxplant(UserInput.inputInt("심을수 있는 나무 갯수"));
		model.setAttribute("dto", dto);
	}

	public static void menu5(Model model) {
		System.out.println("특정 name으로 nowplant변경");
		String name = UserInput.inputString("name");
		int nowplant = UserInput.inputInt("nowplant");
		model.setAttribute("name", name);
		model.setAttribute("nowplant", nowplant);
	}

	public static void menu6(Model model) {
		System.out.println("특정 이름으로 그 컬럼값 삭제");
		int name = UserInput.inputInt("name");
		model.setAttribute("name", name);
	}

	public static void menu7(Model model) {
		System.out.println("프로그램 종료");
	}
}
