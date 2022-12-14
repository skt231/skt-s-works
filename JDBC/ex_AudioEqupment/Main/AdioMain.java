package ex_AudioEquipment.ex;

import java.util.ArrayList;
import ex_AdioEqupipment.service.AdioService;
import ex_AudioEquipment.Model.AdioModel;
import ex_AudioEquipment.dto.Adiodto;
import ex_AudioEquipment.view.IConSoleView;
import ex_AudioEquipment.view.SelectMenu;
import ex_AudioEquipment.view.ViewMethod;

public class AdioMain {

	public static void main(String[] args) {

		AdioService service = new AdioService();
		boolean isFlag = true;
		IConSoleView view=null;
		AdioModel model = null;

		while (isFlag) {
			model = new AdioModel();
			view=new SelectMenu();
			view.execute(model);
			int input =  (int) model.getAttribute("input");

			switch (input) {
			case 1:
				model = new AdioModel();
				service.init();
				ViewMethod.menu1(model);
				break;
			case 2:
				model = new AdioModel();
				model.setAttribute("dtos", service);
				ViewMethod.menu2(model);
				break;
			case 3:
				model = new AdioModel();

				ViewMethod.menu3(model);

				String name = (String) model.getAttribute("name");
				@SuppressWarnings("rawtypes") ArrayList<Adiodto> dtos = service.select(name);

				model.setAttribute("dtos", dtos);

				break;
			case 4:
				model = new AdioModel();
				ViewMethod.menu4(model);
				service.insert((Adiodto<?>) model.getAttribute("dto"));
				break;
			case 5:
//				model=new AdioModel();
//				ViewMethod.menu5(model);	
//				
//				service.update((String)model.getAttribute("name")
//						,(int)model.getAttribute(name));				
				break;
			case 6:
				model = new AdioModel();
				ViewMethod.menu6(model);

				name = (String) model.getAttribute("name");
				service.delete(name);
				break;
			default:
				model = new AdioModel();
				ViewMethod.menu7(model);

				isFlag = false;

			}
		}

	}

}
