package d23;

public class SmartTelevision implements RemoteControl, Searchable,Smartable {
	// RemoteControl?,searchable?

	@Override
	public void search(String keyword) {

		System.out.println("스마트티비" + keyword + "키워드로 검색합니다.");
	}
	public void connectbluetooth() {
		System.out.println("블루투스 연결 되었습니다.");

	}

	@Override
	public void trunon() {
		System.out.println("turn ON");

	}

	@Override
	public void trunoff() {
		System.out.println("turn Off");

	}

	@Override
	public void setvolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 불륨 : " + this.volume);

	}

	// interface 기준
	int volume; // 볼륨
	int inch;
	String brand;
	int smartModuleCount; // 스마트 모듈 개수

	public SmartTelevision(String brand, int inch, int smartmoduleCount) {
		this.brand = brand;
		this.inch = inch;
		this.smartModuleCount = smartmoduleCount;
		this.volume = 0;
	}
}
