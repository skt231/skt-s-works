package view;

import model.Model;
import util.UserInput;

public class Menu6ViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {
		System.out.println("입력한 나이보다 작은 데이터 삭제");
		int age=UserInput.inputInt("나이 :");
		model.setAttribute("age", age);
	}

}
