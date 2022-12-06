package d19;

public class Elevator {

	public static void main(String[] args) {
		
		int a=13;
		int b=7;
		int c=10;
		
		//결과출력
		System.out.printf("%d층 -> %s 엘레베이터\n",a,guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n",b,guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n",c,guide(c));

	}

	public static Object guide(int floor) {
		
		String tmp="";
		if(floor>0 && floor <=10) {
			tmp="저층";
		}else {
			tmp="고층";
		}
		return tmp;
	}

}
