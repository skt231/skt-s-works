package ex_AudioEquipment.view;

import java.util.ArrayList;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.dto.Adiodto;

public class Menu2Viewmpl2 implements IConSoleView{

	@SuppressWarnings("unchecked")
	@Override
	public void execute(AdioModel model) {
		System.out.println("전체 데이터 출력중...");
		ArrayList<Adiodto> dtos =
				(ArrayList<Adiodto>) model.getAttribute("dtos");
		for(Adiodto dto:dtos) {
			System.out.println(dto);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
