package d23;

public class InterMain {

	public static void main(String[] args) {
		Television tv = new Television("삼성", 50);
		tv.turnon();
		tv.trunoff();
		tv.setvolume(30);

		tv.getInch();

		// RemoteControl rc =new RemoteControl();//불가능
		RemoteControl rc = new Television("LG", 30); // 가능
		// 인터페이스는 필드, 매개변수,로컬변수의 타입으로 선언 가능
		tv.turnon();
		tv.trunoff();
		rc.setvolume(50);

		Audio ad = new Audio("아이리버", "흰색");
		ad.trunon();
		ad.turnOff();
		ad.setvolume(30);
		System.out.println(ad.toString());

		RemoteControl rc2 = new Audio("소니", "빨강색");
		rc2.trunon();
		rc2.trunoff();
		rc2.setvolume(-5);
		System.out.println(rc2.toString());

		turnOffItem(tv);
		turnOffItem(ad);
		turnOffItem(rc2);
		turnOffItem(rc);
		// 1번
		SmartTelevision stv = new SmartTelevision("노브랜드", 65, 4);
		stv.trunon();
		stv.setvolume(3);
		stv.trunoff();
		stv.search("천안역 맛집");

		RemoteControl rcStv = new SmartTelevision("노브랜드", 70, 4);

		Searchable saStv = new SmartTelevision("노브랜드", 70, 4);
		saStv.search("천안역맛집");

		// 2번
		SmartTelevision myStv = new SmartTelevision("노브랜드", 70, 4);
		RemoteControl rcMySTv = myStv;
		rcMySTv.trunon();
		rcMySTv.setvolume(3);
		rcMySTv.trunoff();
		Searchable saMyStv = myStv;
		saMyStv.search("천안역맛집");
		// 가장큰차이?|객체의 갯수차이[이미지{차이}]

		RemoteControl[] rcs = { tv, ad, stv };

		for (RemoteControl r : rcs) {
			r.setvolume(RemoteControl.MAX_VOLUME); // 최대 볼륨
		}
		System.out.println("--------------------");

		GoodTelovision gtv = new GoodTelovision("구글", 40, 6);
		gtv.turnon();
		gtv.setvolume(9);
		gtv.trunoff();
		gtv.search(" 겨울패딩 ");

		RemoteControl rcGtv = gtv;//인터페이스 떄문에 담을수 있음
		Searchable saGtv = gtv;	//인터페이스 땜에 담을수 있음
		Television tvv=gtv;	//상속떄문에 담을수 있음
//		Searchable[] saSearchables= {tv,ad,stv};// 담을수 없음
	}

	public static void turnOffItem(RemoteControl rc) {
		rc.trunoff();
	}

}
