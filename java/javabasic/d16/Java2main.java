package d23;

public class Java2main {

	public static void main(String[] args) {
		Bird bd = new Bird();
		Rocket Rck= new Rocket();
		Helicopter Hcp = new Helicopter();
		//인터페이스 타입으로 그룹화
//		bd.fly();
//		Rck.fly();
//		Hcp.fly();
		
		Flyable[] flyableThings = {bd, Rck,Hcp};//모든 날것들을 날림
		for(int i=0;i<flyableThings.length;i++) {
			Flyable temp=flyableThings[i];
			temp.fly();//fly 메서드를 불렀을때
			
			//만약에 로켓인경우, 폭발해라 기능이 추가적으로 호출
			if(temp instanceof Rocket) {
				Rocket Rck1=(Rocket)temp;
				Rck1.bomb();
			}
		}

	}

}

