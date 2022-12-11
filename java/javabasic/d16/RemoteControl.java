package d23;

public interface RemoteControl {
	//인터페이스//선언 부분만 있으면 됨
	
	//변수선언-> 상수
	int MAX_VOLUME=50;	//최대볼륨
	int MIN_VOLUME=0;	//최소볼륨

	//메소드 선언-> 추상 메소드
	void trunon();	//전원켜기
	void trunoff();	//전원끄기
	void setvolume(int volume);	//볼륨조절

}
