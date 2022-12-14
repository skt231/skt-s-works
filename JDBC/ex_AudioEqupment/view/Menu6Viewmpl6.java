package ex_AudioEquipment.view;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.Utill.UserInput;

public class Menu6Viewmpl6 implements IConSoleView {

	public static void main(String[] args) {

	}

	@Override
	public void execute(AdioModel model) {
	
		System.out.println("입력한 제품명 데이터 삭제");
		int name = UserInput.inputInt("제품명 : ");
		model.setAttribute("name", name);
	}

}
