package three;

public class java04_break {

	public static void main(String[] args) {
	
//		for(int i = 0; i<5;i++) {
//			System.out.println("hello world "+ i + "번쨰 입니다.");
		int sum =1048;
		for(int i =1; i<30;i++) {
			System.out.println("현재 for문 실행 순서 = "+ i+"번쨰");
			sum=sum/2;
			if(sum<2) {
				System.out.println(+i+"번째에서 종료합니다. 현재 sum은 "+sum+"입니다.");
				break;
			}
		}
						
			//1.for문이 0번째 실행되고 종료된다.
			//2.for문 안에 if문 넣고 break를 실행하면 for문까지 종료된다.
			//> for문에 특정 값이 된면 강제적으로 for문 종료할 수있다.
//			if(i==2) {
//				break;
			}
			
		}