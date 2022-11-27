package four;

public class 증감연산자 {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("-----------------");
		x++;
		++x;
		System.out.println("x= "+x);//x=12
		
		System.out.println("-----------------");
		y--;
		--y;
		System.out.println("y= "+y);//y=8
		
		System.out.println("-----------------");
		//후위연산자: x의 기존값을 그대로 할당(대입)한 뒤에 연산[연산자(+)가 뒤에 있는것]
		//1.z=x;
		//2.x++;(x=x+1)
		z =x++;
		System.out.println("z= " +z);//z=12
		System.out.println("x= " +x);//x=13
		System.out.println("-----------------");
		//전위연산자:x값을 연산후 z에 할당(대입)한다.[연산자(+)가 뒤에 있는것]
				//1.++x;(x=x+1)
				//2.z=x;
				//대입연산자(=) 기준으로 우측 항이 실행되고,우측항의 좌측부터 연산이 시작
		z=++x;
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		
		System.out.println("-----------------");
		z=++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("-----------------");
		//z=14
		//x=14
		//y=8
		//++x=14의 값을 1증가 한후  z에 값에 할당
		//y++=8의 값을 z에 연산후 y의 값 1증가
		//y는 9가 되어서 출력
	//
		//i++ 후위연산자: 계산 전에 출력하고, 연산한다.
		//++i 전위연산자: 계산 완료후 출력한다.
		
				
				
	
	}
	public static void postPreFixExample() {
		int i=10;
		int j=10;
		//i++
		System.out.println(
			        	(i++)+","+ //출력:10 연산완료값:11 
						(++i)+","+ //출력:11  연산완료값:11 
						(i++)+","+ //출력:11  연산완료값:12 
						(++i)+","+ //출력:13  연산완료값:13 
						(++i)+","+ //출력:14  연산완료값:14 
						(++i)+","+ //출력:15  연산완료값:15 
						(i++)+","+ //출력:15  연산완료값:16 
						 (i)+","   //출력:16  연산완료값:17
		);
		System.out.println(
				        (j--)+","+ //출력:10  연산완료값:9 
						(++j)+","+ //출력:10  연산완료값:10 
						(j++)+","+ //출력:10  연산완료값:11 
						(--j)+","+ //출력:10  연산완료값:10 
						(--j)+","+ //출력:9  연산완료값:9 
						(j--)+","+ //출력:9  연산완료값:8 
						(j)+","    //출력:8  연산완료값:9 
		);
	}
		
	
}
