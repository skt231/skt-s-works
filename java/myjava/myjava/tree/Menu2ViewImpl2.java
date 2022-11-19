package myjava.tree;

import java.util.ArrayList;

public class Menu2ViewImpl2 implements IconsoleView {

	// TODO Auto-generated method stub

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		System.out.println("전체 데이터를 출력합니다.");
		ArrayList<Treedto> dtos = (ArrayList<Treedto>) model.getAttribute("dtos");
		for (Treedto dto : dtos) {
			System.out.println(dto);
		}
		System.out.println("select작업을 종료합니다.");

	}
}
