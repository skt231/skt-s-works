package view;

import dto.HumanDto;
import model.Model;
import util.UserInput;

public class Menu4ViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
				System.out.println("입력하고 자하는 Human데이터 입력");
				
				HumanDto dto=new HumanDto();
				dto.setName(UserInput.inputString("이름"));
				dto.setAge(UserInput.inputInt("나이"));
				dto.setHeight(UserInput.inputDouble("키"));
				dto.setBirthday(UserInput.inputLocalDateTime("생일"));
				
				model.setAttribute("dto", dto);
	}

}
