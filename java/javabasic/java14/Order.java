package d19;

public class Order {
	int orderNum;
	Menu[] menus;

	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}

	public int totalPrice() {
		int result = menus[0].price + menus[1].price + menus[2].price;
		return result;
	}
}
