package view;

import model.Model;
import util.UserInput;

public class Menu5ViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {
		System.out.println("특정 name으로 age변경");
		String name=UserInput.inputString("이름 :");
		int age =UserInput.inputInt("나이 :");
		
		model.setAttribute("name", name);
		model.setAttribute("age", age);		
	}

}
