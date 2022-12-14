package ex_AudioEquipment.view;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.Utill.UserInput;

public class Menu3Viewmpl3 implements IConSoleView{


	@Override
	public void execute(AdioModel model) {
		// TODO Auto-generated method stub
		System.out.println(" 선택한 브랜드 제품 데이터를 출력중...");
		model.setAttribute("brand",UserInput.inputString("brand를 입력하세요."));
		
	}

}
