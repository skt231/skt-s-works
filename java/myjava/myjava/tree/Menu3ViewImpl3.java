package myjava.tree;

public class Menu3ViewImpl3 implements IconsoleView{


	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		System.out.println("입력한 값보다 현재 심은 나무개수가 작은 나무를 출력합니다.");
		model.setAttribute("nowplant", UserInput.inputInt("나무개수를 입력하세요"));
	}

}
