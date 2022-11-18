package basic01;
//세값의 최솟값을 구하는 min3메서드를 작성하시오
public class MinFor3Integers {
	static int min3(int a,int b, int c) {
		int min=0;
		if(a >b) {	//a>b
			if(b<c) {	//b<c
				min=b;
			}else {	//	b>c
				min=c;
			}
		}else {	//a<b
			if(a>c) {	//a>c
				min=c;
			}else {		//a<c
				min=a;
			}
		}
		return min;
	}
	public static void main(String[] args) {
	System.out.println("mint(1, 2, 3) = "+ min3(1, 2, 3));
	System.out.println("mint(3, 1, 2) = "+ min3(3, 1, 2));
	System.out.println("mint(2, 3, 1) = "+ min3(2, 3, 1));
	System.out.println("mint(3, 2, 1) = "+ min3(3, 2, 1));
	System.out.println("mint(1, 3, 2) = "+ min3(1, 3, 2));
	System.out.println("mint(2, 1, 3) = "+ min3(2, 1, 3));

	}

}
