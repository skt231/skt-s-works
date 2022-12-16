package view;

import model.Model;
import util.UserInput;

public class Menu3InputViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {
		System.out.println("입력한 height값보다 큰 학생를 출력할 예정입니다.");
		model.setAttribute("height", UserInput.inputDouble("height를 입력세요"));
	}

}
