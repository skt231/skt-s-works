package ex_AudioEquipment.view;

import java.util.ArrayList;

import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.dto.Adiodto;
import ex_AudioEquipment.Utill.UserInput;

public class ViewMethod {

	public static void selectMenu(AdioModel model) {
		System.out.println("-------------------------------------------");
		System.out.println("--            제품 조회 프로그램               --");
		System.out.println("--                                       --");
		System.out.println("--     1.기존 제품목록 호출     2.select      --");
		System.out.println("--	   3.select(brand)     4.insert(dto) --");
		System.out.println("--	   5.update            6.delete      --");
		System.out.println("--		          7.exit                 --");
		System.out.println("--                                       --");
		System.out.println("-------------------------------------------");
	}
	public static void menu1(AdioModel model) {
		System.out.println("목록을 호출하였습니다.");
	}
	@SuppressWarnings("unchecked")
	public static void menu2(AdioModel model) {
		System.out.println("전체 데이터 출력중...");
		ArrayList<Adiodto> dtos=
				(ArrayList<Adiodto>) model.getAttribute("dtos");
		for(Adiodto dto:dtos) {
			System.out.println(dto);
		}
		System.out.println("출력이 완료되었습니다.");
	}
	public static void menu3(AdioModel model) {
		System.out.println("선택한 브랜드 제품 데이터를 출력중...");
		model.setAttribute("브랜드", UserInput.inputString("브랜드를 입력하세요."));
}
	public static void menu4(AdioModel model) {
		Adiodto dto=new Adiodto();
		
		dto.setName(UserInput.inputString("이름"));
		dto.setBrand(UserInput.inputString("브랜드"));
		dto.setWeight(UserInput.inputDouble("무게"));
		dto.setUnit(UserInput.inputString("유닛형태"));
		dto.setBluetooth(UserInput.inputString("블루투스유무"));
		dto.setProductdate(UserInput.inputLocalDateTime("출고일"));
		
		model.setAttribute("dto", dto);
}
	public static void menu5(AdioModel model) {
	
}
	public static void menu6(AdioModel model) {
		System.out.println("입력한 제품명 데이터 삭제");
		int name = UserInput.inputInt("제품명 : ");
		model.setAttribute("name", name);
}
	public static void menu7(AdioModel model) {
		System.out.println("프로그램 종료");
	}

}
