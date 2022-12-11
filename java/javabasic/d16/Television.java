package d23;

public class Television implements RemoteControl {
	// 클래스 필드변수

	int volume; // 볼륨
	int inch;
	String brand;

	Television(String brand, int inch) {
		volume = 0;
		this.brand = brand;
		this.inch = inch;
	}

	public void turnon() {
		System.out.println("Tv_On");
	}



	public void setvolume(int volume) {
		// TV볼륨조절 +,-

		// 클래스(필드, 생성자,메소드(getter/setter +a))
		// setter,getter
		// setter 1. 외부에 공개되지 않은 변수에 대한 접근 제공
		// private volume <-> public setVolume
		// 2.값을 조절(사전에 필터링)
		// setter:외부에서 잘못된 값이 들어올까봐
		// getter:return할 양식을 변경
		// setter나 getter나 이름을 짓는 양식 똑같음
		// void set +변수명
		// 변수의 타입 get + 변수명
		// 볼륨조절 값
		
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 불륨 : " + this.volume);

		// 30으로 세팅

		// TV 리모콘 볼류 0~30
		// BTV 셋톱박스 리모콘 볼륨 0~50
		// 다른TV 0~100 --> 각각 다르므로 상수필드로 조절함
	}

	public static void main(String[] args) {
		
	}

	public int getInch() {
		
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void trunon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trunoff() {
		// TODO Auto-generated method stub
		System.out.println("Tv_Off");
	}


		
	}


