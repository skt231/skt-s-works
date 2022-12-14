package ex_AudioEquipment.view;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.dto.Adiodto;
import ex_AudioEquipment.Utill.UserInput;

public class Menu4Viewmpl4 implements IConSoleView{


	@Override
	public void execute(AdioModel model) {
		// TODO Auto-generated method stub
		Adiodto dto=new Adiodto();
		
		dto.setName(UserInput.inputString("이름"));
		dto.setBrand(UserInput.inputString("브랜드"));
		dto.setWeight(UserInput.inputDouble("무게"));
		dto.setUnit(UserInput.inputString("유닛형태"));
		dto.setBluetooth(UserInput.inputString("블루투스유무"));
		dto.setProductdate(UserInput.inputLocalDateTime("출고일"));
		
		model.setAttribute("dto", dto);
	}

}
