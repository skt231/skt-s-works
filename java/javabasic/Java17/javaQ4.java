package d25;

public class JavaQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(0, 16); 
		Computer apple = new Computer(1, 32); 
		Computer galaxy = new Computer(2, 16);
		pc.print(); 
		apple.print();
		galaxy.print();
		
		Computer[] coms = {pc, apple, galaxy};
		for(Computer c : coms) {
			c.print();
		}
		
		Printable[] paArr = {pc, apple, galaxy};
		for(Printable pa : paArr) {
			pa.print();
		}
	}
}

interface Printable { //출력할수 있는지
	public void print();  //출력한다 의미를 가진 print()메소드는 꼭 구현
}

class Computer implements Printable {
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	
	//필드
	//설치된 osType 뭔지
	int osTypeIndex; //0 1 2
	String osTypeName; //OS 이름
	//메인메모리 
	int memory;  //컴퓨터의 메모리
	
	public Computer(int osTypeIndex, int memory) {
		this.osTypeIndex = osTypeIndex;  //2
		this.memory = memory;  //16
		this.osTypeName = osType[osTypeIndex];
	}
	
	public void print() {
		System.out.println("운영체제: " + osTypeName + ", 메인메모리:" + memory);
//		System.out.println("운영체제: " + osType[osTypeIndex] + ", 메인메모리:" + memory);
	}
	
	
	
}

















