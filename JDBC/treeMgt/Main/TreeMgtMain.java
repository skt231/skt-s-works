package treeMgt.ex;

import java.util.ArrayList;

import treeMgt.dto.Treedto;
import treeMgt.model.Model;
import treeMgt.service.treeservice;
import treeMgt.view.IconsoleView;
import treeMgt.view.Menu1ViewImpl1;
import treeMgt.view.Menu2ViewImpl2;
import treeMgt.view.Menu3ViewImpl3;
import treeMgt.view.Menu4ViewImpl4;
import treeMgt.view.Menu6ViewImpl6;
import treeMgt.view.Menu7ViewImpl7;
import treeMgt.view.SelectMenuViewImpl;
import treeMgt.view.ViewMethod;

public class TreeMgtMain {

	public static void main(String[] args) {
		treeservice service = new treeservice();
		boolean isFlag = true;
		IconsoleView view = null;
		Model model = null;
		while (isFlag) {
			model = new Model();
			view = new SelectMenuViewImpl();
			view.execute(model);
			ViewMethod.selectMenu(model);
			int input = (int) model.getAttribute("input");

			switch (input) {
			case 1:
				model=new Model();
				service.init();
				view= new Menu1ViewImpl1();
				view.execute(model);
				break;
			case 2:
				model=new Model();
				model.setAttribute("dtos", service.select());
				view.execute(model);
				ViewMethod.menu2(model);
				view=new Menu2ViewImpl2();
				break;

			case 3:
				model=new Model();
				view=new Menu3ViewImpl3();
				view.execute(model);
				int nowplant=(int) model.getAttribute("nowplant");
				ArrayList<Treedto> dtos=service.select(nowplant);
				
				model.setAttribute("dtos", dtos);
				ViewMethod.menu3OutPut(model);
				view.execute(model);
				
				break;

			case 4:
				model=new Model();
				view=new Menu4ViewImpl4();
				view.execute(model);
				service.insert((Treedto)model.getAttribute("dto"));
				break;

			case 5:
				model=new Model();
				view.execute(model);
				service.update((String) model.getAttribute("name"),(int) model.getAttribute("nowplant"));
				break;

			case 6:
				model= new Model();
				view=new Menu6ViewImpl6();
				view.execute(model);
				Integer name=(Integer)model.getAttribute("name");
				service.delete(name);
				break;


			default:
				model=new Model();
				view=(IconsoleView) new Menu7ViewImpl7();
				view.execute(model);
				ViewMethod.menu7(model);
				
				isFlag=false;
			}
		}

	}

}
