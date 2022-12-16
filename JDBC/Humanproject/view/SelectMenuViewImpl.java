package view;

import model.Model;
import util.UserInput;

public class SelectMenuViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {		
		System.out.println("");
		System.out.println("");
		System.out.println("human관리 프로그램");
		System.out.println("1.test값 입력 2.select 3.select(height)");
		System.out.println("4.insert(dto) 5.update(name,age)");
		System.out.println("6.delete(age) 7.exit");
		int input=UserInput.inputInt("선택");
		model.setAttribute("input", input);
	}

}
