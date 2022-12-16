package treeMgt.view;

import treeMgt.model.Model;
import treeMgt.util.UserInput;

public class Menu6ViewImpl6 implements IconsoleView {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		System.out.println("특정 이름으로 그 컬럼값 삭제");
		int name = UserInput.inputInt("name");
		model.setAttribute("name", name);
	}

}
