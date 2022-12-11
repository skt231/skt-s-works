package d23;

public class  Audio implements RemoteControl{
	int volume;	//불륨
	String brand;	//브랜드
	String color;	//오디오 색상
	
	public Audio(String brand, String color) {
		this.brand=brand;
		this.color=color;
		this.volume=0;
	}
	public String toString() {
		return String.format(" 브랜드 : %s , 색: %s , 오디오 현재 불륨 : %d ", brand,color,volume);
	}
		
		public void trunon() {
			System.out.println("오디오를 켜요.");
		}
		
		public void turnOff() {
			System.out.println("오디오를 꺼요.");
		}
		
		public void setvolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨 : " + this.volume);
	}
		@Override
		public void trunoff() {
			// TODO Auto-generated method stub
			
		}
	

}
