package ex_AudioEquipment.view;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.Utill.UserInput;

public class SelectMenu implements IConSoleView {
	
	
	public void execute(AdioModel model) {
		System.out.println("-------------------------------------------");
		System.out.println("--            제품 조회 프로그램             --");
		System.out.println("--                                       --");
		System.out.println("--     1.기존 제품목록 호출     2.select      --");
		System.out.println("--	   3.select(brand)     4.insert(dto) --");
		System.out.println("--	   5.update            6.delete      --");
		System.out.println("--		          7..exit                 --");
		System.out.println("--                                       --");
		System.out.println("-------------------------------------------");
		
		int input =UserInput.inputInt("선택");
		
		model.setAttribute("input", input);
	}
}
