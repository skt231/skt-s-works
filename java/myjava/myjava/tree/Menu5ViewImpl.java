package myjava.tree;

import myjava.tree.Model;
import myjava.tree.UserInput;

public class Menu5ViewImpl implements IconsoleView {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		System.out.println("특정 name으로 nowplant변경");
		String name = UserInput.inputString("name");
		int nowplant = UserInput.inputInt("nowplant");
		model.setAttribute("name", name);
		model.setAttribute("nowplant", nowplant);
	}

}
