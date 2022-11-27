package three;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int타입으로 변수이름 num10으로 선언
		//10이라는 데이터를 대입연산자(=) 좌측 num10변수에 전달(할당) 
		int num10 =10;
		if(num10 ==20) {
			System.out.println("num10은 20이다!"); 
		}else {
			System.out.println("num10은 20이 아니다");
		//if문의 조건이 성립되지 않을 경우에 else{}코드영역 실행			
		}  if(num10==15) {
			System.out.println("num10은 15이다!");
		//(mum10 = 15): num10변수의 값이 15와 같으면 조건성립(true)
		//*if문은 조건이 성립되는 {}영역에 들어갈 경우 하단 부분 조건은 생략	
		} else if(num10==10) {
			System.out.println("num10은 10이다!");
			//if문의 조건이 성립되지 않을 경우에 else{}코드영역이 실행
			//*모든 if문이 성립이 안될 경우에만  else{}코드 영역 실행
		}
	}

}
