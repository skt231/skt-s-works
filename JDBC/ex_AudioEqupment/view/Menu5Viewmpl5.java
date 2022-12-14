package ex_AudioEquipment.view;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.Utill.UserInput;

public class Menu5Viewmpl5 implements IConSoleView {

	@Override
	public void execute(AdioModel model) {
		System.out.println("입력한 제품명 데이터 삭제");
		String name = UserInput.inputString("제품명 : ");
		model.setAttribute("name", name);
		String brand = UserInput.inputString("브랜드명 : ");
		model.setAttribute("brand", brand);

	}
}
