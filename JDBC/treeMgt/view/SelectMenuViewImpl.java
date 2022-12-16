package treeMgt.view;

import treeMgt.model.Model;
import treeMgt.util.UserInput;

public class SelectMenuViewImpl implements IconsoleView{

	@Override

		public void execute(Model model) {
			// TODO Auto-generated method stub
			System.out.println("-------------------------------");
			System.out.println("--	 나무 관리 시스템   --");
			System.out.println("----------1.시작 ---------------");
			System.out.println("---2.select 3.select------------");
			System.out.println("------4.insert 5.update---------");
			System.out.println("----6.delete  7.exit------------");
			System.out.println("--------------------------------");
			int input = UserInput.inputInt("선택");
			model.setAttribute("input", input);
		}
		
		
	}

	


