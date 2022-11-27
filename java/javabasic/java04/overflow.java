package four;

public class overflow {

	public static void main(String[] args) {
		// overflow
		//타입이 갖고 있는 max보다 더 많은 수치를 받을 경우를 이컫음
		int x =10000000;
		int y=10000000;
		//int z= x*y;//2억 7천만
		double z=(double) x*y;
		System.out.println(z);

	}

}
