package d19;

import java.awt.Menu;

public class ChinesRestaurant {

	public static void main(String[] args) {
		// 주문을 위한 메뉴선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);

		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambong, tangsook };
		Order order = new Order(123, menuArr);

		// 주문 결과 출력
		System.out.println("주문 합계: %d원\n", order.totalPrice());
	}
}

class Order {
	// 필드(인스턴스 필드)

	int orderNum;
	Menu[] menus;

	// 생성자
	public Order(int i,Menu[]arr) {
		orderNum=i;
		menus= arr;
		
		//메소드(인스턴스 메소드)
		
		int totalPrice() {
			//1.모든 주문 메뉴의 총합을 반환하세요
				int result = menus[0].price+menus[1].price+menus[2].price;
				return result;
			
			return resultt;
		}
	}

	public Object totalPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	class Menu {
		// 필드
		String name;
		int price;

		// 생성지
		public Menu(String str, int i) {
			name = str;
			price = i;
		}
	}

}
