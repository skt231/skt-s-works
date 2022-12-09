package d22;

public class Java연습문제30 {

	public static void main(String[] args) {
		// 객체 생성
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");

		// 부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };
//		Currency[] currencies = new Currency[4];
//		currencies[0]=krw;
//		...
		// 모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
			/*
			 * for (int i=0;i<currencies.length;i++){
			 * system.out.println(currencies[i].toString()); }
			 */
		}
		krw.name = "KRW";
		krw.amount = 1500.00;
		krw.nonation = "원";

		usd.name = "USD";
		usd.amount = 100.50;
		usd.nonation = "달러";

		eur.name = "EUR";
		eur.amount = 260.87;
		eur.nonation = "유로";

		jpy.name = "JPY";
		jpy.amount = 1400;
		jpy.nonation = "엔";

	}

}

class Currency {
	double amount;
	String nonation;
	String name;

	public Currency(double amount, String nonation) {
		this.amount = amount;
		this.nonation = nonation;

	}

	public String toString() {
		String result = String.format(name + ": %.2f %s", amount, nonation);
		return result;
	}
}

/* 1.부모 클래스 Currency를 만드시오 */
/* 2.상속을 통해 중복 코드를 제거 후, */
/* 3.생성자를 올바르게 수정하시오. */
/* 4.to String()메소드를 오버라이딩 하시오 */// toString 재정의 override toSting();
//public String toString()
class KRW extends Currency {

	KRW(double amount, String nonation) {
		// 부모클래스가 먼저 태어나고 -> 자식 클래스 태어나야
		super(amount, nonation);
		this.name = "KRW";

	}
}

class USD extends Currency {

	public USD(double amount, String nonation) {
		super(amount, nonation);
		this.name = "USD";
	}
}

class EUR extends Currency {

	public EUR(double amount, String nonation) {
		super(amount, nonation);
		this.name = "EUR";
	}
}

class JPY extends Currency {

	public JPY(double amount, String nonation) {
		super(amount, nonation);
		this.name = "JPY";
	}
}
