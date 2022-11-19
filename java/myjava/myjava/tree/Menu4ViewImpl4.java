package myjava.tree;

public class Menu4ViewImpl4 implements IconsoleView {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		System.out.println("나무정보를 입력하세요");
		
		Treedto dto= new Treedto();
		String name = UserInput.inputString("이름");
		dto.setName(name);
		dto.setPrice(UserInput.inputInt("가격"));
		dto.setGrowtime(UserInput.inputLocalDateTime("자라는시간"));
		dto.setExp(UserInput.inputInt("경험치 량"));
		dto.setNowplant(UserInput.inputInt("현재 심어진 나무 갯수"));
		dto.setMaxplant(UserInput.inputInt("심을수 있는 나무 갯수"));
		model.setAttribute("dto",dto);
	}

}
